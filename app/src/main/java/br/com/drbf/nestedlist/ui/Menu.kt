package br.com.drbf.nestedlist.ui

data class Menu(
    val id: Long,
    val title: String,
    val description: String,
    val isSelected: Boolean = false,
    val isExpanded: Boolean = false,
    val subMenus : List<Menu>?,
    val actions : Action
)

data class Action(
    val uri : String,
)
