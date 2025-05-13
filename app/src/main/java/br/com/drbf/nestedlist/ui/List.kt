package br.com.drbf.nestedlist.ui

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.gestures.scrollBy
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyListState
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue

import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue

import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import kotlinx.coroutines.launch

@Composable
fun NestedListScreen(
    modifier: Modifier = Modifier,
    menus: List<Menu>,
) {

    val scope = rememberCoroutineScope()

    val scrollOffset = 100.dp.toPx()

    var myMenus by remember { mutableStateOf(emptyList<Menu>()) }

    LaunchedEffect(menus) {
        myMenus = menus
    }
    val listState = rememberLazyListState()


    val onClick = remember {
        { menu: Menu ->
            myMenus = myMenus.map { targetMenu ->
                if (targetMenu == menu) {
                    val currentPosition = myMenus.countMenusBefore(targetMenu) + 5
                    val lastPosition = listState.layoutInfo.visibleItemsInfo.last().index
                    if (currentPosition == lastPosition && !targetMenu.isExpanded) {
                        scope.launch {
                            listState.scrollBy(scrollOffset)
                        }
                    }
                    targetMenu.copy(isExpanded = !targetMenu.isExpanded)
                } else {
                    targetMenu
                }
            }

        }
    }






    NestedList(
        modifier = modifier,
        menus = myMenus,
        listState = listState,
        onClick = onClick
    )
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun NestedList(
    modifier: Modifier = Modifier,
    menus: List<Menu>,
    listState: LazyListState,
    onClick: (menu: Menu) -> Unit = {},

    ) {

    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background)
            .padding(vertical = 8.dp),
        state = listState
    ) {

        items(5) {
            Text(
                text = "Nested List",
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp)
            )
        }

        menus.forEach { menu ->
            stickyHeader {
                MenuView(
                    modifier = Modifier.padding(8.dp),
                    menu = menu,
                    onClick = onClick
                )
            }
            if (menu.isExpanded) {
                menu.subMenus?.forEach { subMenu ->
                    item {
                        SubMenuView(
                            modifier = Modifier.padding(8.dp),
                            menu = subMenu,
                            onClick = onClick
                        )
                    }
                }
            }

        }
    }

}


@Composable
fun MenuView(
    modifier: Modifier = Modifier,
    menu: Menu,
    onClick: (menu: Menu) -> Unit = {}
) {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.surfaceContainer)
            .padding(8.dp)
            .clickable { onClick(menu) }
    ) {
        Text(
            text = menu.title,
            modifier = modifier
        )
    }
}

@Composable
fun SubMenuView(
    modifier: Modifier = Modifier,
    menu: Menu,
    onClick: (menu: Menu) -> Unit = {}
) {
    Row(
        modifier = Modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background)
            .padding(8.dp)
            .clickable { onClick(menu) }
    ) {
        Text(
            text = menu.title,
            modifier = modifier
        )
    }

}

@Preview(showBackground = true)
@Composable
private fun NestedListPreview() {

    NestedListScreen(
        menus = Repos.menus
    )

}

fun List<Menu>.countMenusBefore(targetMenu: Menu): Int {
    var count = 0
    for (menu in this) {
        if (menu == targetMenu) {
            return count
        }
        count++ // Conta o menu atual
        if (menu.isExpanded) {
            count += menu.subMenus?.size ?: 0 // Conta todos os submenus
        }
    }
    return -1 // Retorna 0 se o menu não for encontrado
}

@Composable
fun Dp.toPx(): Float {
    return with(LocalDensity.current) { this@toPx.toPx() }
}