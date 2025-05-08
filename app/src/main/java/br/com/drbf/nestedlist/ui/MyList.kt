package br.com.drbf.nestedlist.ui

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.animation.animateContentSize
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MyNestedListScreen(
    modifier: Modifier = Modifier,
    menus: List<Menu>,
) {

    var myMenus by remember { mutableStateOf(emptyList<Menu>()) }

    LaunchedEffect(menus) {
        myMenus = menus
    }
    val onClick = remember {
        { menu: Menu ->
            myMenus = myMenus.map {
                if (it == menu) {
                    it.copy(isExpanded = !it.isExpanded)
                } else {
                    it
                }
            }
        }
    }

    MyNestedList(
        modifier = modifier,
        menus = myMenus,
        onClick = onClick
    )
}

@OptIn(ExperimentalFoundationApi::class)
@Composable
fun MyNestedList(
    modifier: Modifier = Modifier,
    menus: List<Menu>,
    onClick: (menu: Menu) -> Unit = {}
) {
    LazyColumn(
        modifier = modifier
            .fillMaxSize()
            .background(color = MaterialTheme.colorScheme.background)
            .padding(vertical = 8.dp)
    ) {

        item {
            Text(
                text = "Nested List",
                modifier = Modifier
                    .fillMaxSize()
                    .padding(8.dp)
            )
        }

        items(menus, key = { it.id }) { menu ->
            MyMenuView(
                modifier = Modifier.padding(8.dp),
                menu = menu,
                onClick = onClick
            )
        }
    }

}


@Composable
fun MyMenuView(
    modifier: Modifier = Modifier,
    menu: Menu,
    onClick: (menu: Menu) -> Unit = {}
) {
    Column(modifier = modifier) {

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

        if(menu.isExpanded) {
            menu.subMenus?.reversed()?.forEach { subMenu ->

                MySubMenuView(
                    modifier = Modifier.padding(8.dp)
                        .animateContentSize (),
                    menu = subMenu,
                    onClick = onClick
                )

            }
        }
    }
}

@Composable
fun MySubMenuView(
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
private fun MyNestedListPreview() {

    MyNestedListScreen(
        menus = Repos.menus
    )

}