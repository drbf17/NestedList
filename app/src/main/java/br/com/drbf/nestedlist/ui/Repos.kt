package br.com.drbf.nestedlist.ui

object Repos {
    val menus = listOf(
        Menu(1, "Title 1", "Description 1", subMenus = listOf(
            Menu(11, "SubTitle 1.1", "SubDescription 1.1", subMenus = null, actions = Action("subUri1.1")),
            Menu(12, "SubTitle 1.2", "SubDescription 1.2", subMenus = null, actions = Action("subUri1.2")),
            Menu(13, "SubTitle 1.3", "SubDescription 1.3", subMenus = null, actions = Action("subUri1.3")),
            Menu(14, "SubTitle 1.4", "SubDescription 1.4", subMenus = null, actions = Action("subUri1.4")),
            Menu(15, "SubTitle 1.5", "SubDescription 1.5", subMenus = null, actions = Action("subUri1.5"))
        ), actions = Action("uri1")),
        Menu(2, "Title 2", "Description 2", subMenus = listOf(
            Menu(21, "SubTitle 2.1", "SubDescription 2.1", subMenus = null, actions = Action("subUri2.1")),
            Menu(22, "SubTitle 2.2", "SubDescription 2.2", subMenus = null, actions = Action("subUri2.2")),
            Menu(23, "SubTitle 2.3", "SubDescription 2.3", subMenus = null, actions = Action("subUri2.3")),
            Menu(24, "SubTitle 2.4", "SubDescription 2.4", subMenus = null, actions = Action("subUri2.4")),
            Menu(25, "SubTitle 2.5", "SubDescription 2.5", subMenus = null, actions = Action("subUri2.5")),
            Menu(26, "SubTitle 2.6", "SubDescription 2.6", subMenus = null, actions = Action("subUri2.6")),
            Menu(27, "SubTitle 2.7", "SubDescription 2.7", subMenus = null, actions = Action("subUri2.7")),
            Menu(28, "SubTitle 2.8", "SubDescription 2.8", subMenus = null, actions = Action("subUri2.8")),
            Menu(29, "SubTitle 2.9", "SubDescription 2.9", subMenus = null, actions = Action("subUri2.9")),
            Menu(210, "SubTitle 2.10", "SubDescription 2.10", subMenus = null, actions = Action("subUri2.10"))
        ), actions = Action("uri2")),
        Menu(3, "Title 3", "Description 3", subMenus = null, actions = Action("uri3")),
        Menu(4, "Title 4", "Description 4", subMenus = listOf(
            Menu(41, "SubTitle 4.1", "SubDescription 4.1", subMenus = null, actions = Action("subUri4.1")),
            Menu(42, "SubTitle 4.2", "SubDescription 4.2", subMenus = null, actions = Action("subUri4.2")),
            Menu(43, "SubTitle 4.3", "SubDescription 4.3", subMenus = null, actions = Action("subUri4.3")),
            Menu(44, "SubTitle 4.4", "SubDescription 4.4", subMenus = null, actions = Action("subUri4.4")),
            Menu(45, "SubTitle 4.5", "SubDescription 4.5", subMenus = null, actions = Action("subUri4.5"))
        ), actions = Action("uri4")),
        Menu(5, "Title 5", "Description 5", subMenus = listOf(
            Menu(51, "SubTitle 5.1", "SubDescription 5.1", subMenus = null, actions = Action("subUri5.1")),
            Menu(52, "SubTitle 5.2", "SubDescription 5.2", subMenus = null, actions = Action("subUri5.2")),
            Menu(53, "SubTitle 5.3", "SubDescription 5.3", subMenus = null, actions = Action("subUri5.3")),
            Menu(54, "SubTitle 5.4", "SubDescription 5.4", subMenus = null, actions = Action("subUri5.4")),
            Menu(55, "SubTitle 5.5", "SubDescription 5.5", subMenus = null, actions = Action("subUri5.5")),
            Menu(56, "SubTitle 5.6", "SubDescription 5.6", subMenus = null, actions = Action("subUri5.6")),
            Menu(57, "SubTitle 5.7", "SubDescription 5.7", subMenus = null, actions = Action("subUri5.7")),
            Menu(58, "SubTitle 5.8", "SubDescription 5.8", subMenus = null, actions = Action("subUri5.8")),
            Menu(59, "SubTitle 5.9", "SubDescription 5.9", subMenus = null, actions = Action("subUri5.9")),
            Menu(510, "SubTitle 5.10", "SubDescription 5.10", subMenus = null, actions = Action("subUri5.10"))
        ), actions = Action("uri5")),
        Menu(6, "Title 6", "Description 6", subMenus = null, actions = Action("uri6")),
        // Continue this pattern until you have 100 objects
        Menu(7, "Title 7", "Description 7", subMenus = listOf(
            Menu(71, "SubTitle 7.1", "SubDescription 7.1", subMenus = null, actions = Action("subUri7.1")),
            Menu(72, "SubTitle 7.2", "SubDescription 7.2", subMenus = null, actions = Action("subUri7.2")),
            Menu(73, "SubTitle 7.3", "SubDescription 7.3", subMenus = null, actions = Action("subUri7.3")),
            Menu(74, "SubTitle 7.4", "SubDescription 7.4", subMenus = null, actions = Action("subUri7.4")),
            Menu(75, "SubTitle 7.5", "SubDescription 7.5", subMenus = null, actions = Action("subUri7.5"))
        ), actions = Action("uri7")),
        Menu(8, "Title 8", "Description 8", subMenus = listOf(
            Menu(81, "SubTitle 8.1", "SubDescription 8.1", subMenus = null, actions = Action("subUri8.1")),
            Menu(82, "SubTitle 8.2", "SubDescription 8.2", subMenus = null, actions = Action("subUri8.2")),
            Menu(83, "SubTitle 8.3", "SubDescription 8.3", subMenus = null, actions = Action("subUri8.3")),
            Menu(84, "SubTitle 8.4", "SubDescription 8.4", subMenus = null, actions = Action("subUri8.4")),
            Menu(85, "SubTitle 8.5", "SubDescription 8.5", subMenus = null, actions = Action("subUri8.5")),
            Menu(86, "SubTitle 8.6", "SubDescription 8.6", subMenus = null, actions = Action("subUri8.6")),
            Menu(87, "SubTitle 8.7", "SubDescription 8.7", subMenus = null, actions = Action("subUri8.7")),
            Menu(88, "SubTitle 8.8", "SubDescription 8.8", subMenus = null, actions = Action("subUri8.8")),
            Menu(89, "SubTitle 8.9", "SubDescription 8.9", subMenus = null, actions = Action("subUri8.9")),
            Menu(810, "SubTitle 8.10", "SubDescription 8.10", subMenus = null, actions = Action("subUri8.10"))
        ), actions = Action("uri8")),
        Menu(9, "Title 9", "Description 9", subMenus = null, actions = Action("uri9")),
        Menu(10, "Title 10", "Description 10", subMenus = listOf(
            Menu(101, "SubTitle 10.1", "SubDescription 10.1", subMenus = null, actions = Action("subUri10.1")),
            Menu(102, "SubTitle 10.2", "SubDescription 10.2", subMenus = null, actions = Action("subUri10.2")),
            Menu(103, "SubTitle 10.3", "SubDescription 10.3", subMenus = null, actions = Action("subUri10.3")),
            Menu(104, "SubTitle 10.4", "SubDescription 10.4", subMenus = null, actions = Action("subUri10.4")),
            Menu(105, "SubTitle 10.5", "SubDescription 10.5", subMenus = null, actions = Action("subUri10.5"))
        ), actions = Action("uri10")),
        Menu(11, "Title 11", "Description 11", subMenus = listOf(
            Menu(111, "SubTitle 11.1", "SubDescription 11.1", subMenus = null, actions = Action("subUri11.1")),
            Menu(112, "SubTitle 11.2", "SubDescription 11.2", subMenus = null, actions = Action("subUri11.2")),
            Menu(113, "SubTitle 11.3", "SubDescription 11.3", subMenus = null, actions = Action("subUri11.3")),
            Menu(114, "SubTitle 11.4", "SubDescription 11.4", subMenus = null, actions = Action("subUri11.4")),
            Menu(115, "SubTitle 11.5", "SubDescription 11.5", subMenus = null, actions = Action("subUri11.5")),
            Menu(116, "SubTitle 11.6", "SubDescription 11.6", subMenus = null, actions = Action("subUri11.6")),
            Menu(117, "SubTitle 11.7", "SubDescription 11.7", subMenus = null, actions = Action("subUri11.7")),
            Menu(118, "SubTitle 11.8", "SubDescription 11.8", subMenus = null, actions = Action("subUri11.8")),
            Menu(119, "SubTitle 11.9", "SubDescription 11.9", subMenus = null, actions = Action("subUri11.9")),
            Menu(1110, "SubTitle 11.10", "SubDescription 11.10", subMenus = null, actions = Action("subUri11.10"))
        ), actions = Action("uri11")),
        Menu(12, "Title 12", "Description 12", subMenus = null, actions = Action("uri12")),
        Menu(13, "Title 1", "Description 1", subMenus = listOf(
            Menu(131, "SubTitle 1.1", "SubDescription 1.1", subMenus = null, actions = Action("subUri1.1")),
            Menu(132, "SubTitle 1.2", "SubDescription 1.2", subMenus = null, actions = Action("subUri1.2")),
            Menu(133, "SubTitle 1.3", "SubDescription 1.3", subMenus = null, actions = Action("subUri1.3")),
            Menu(134, "SubTitle 1.4", "SubDescription 1.4", subMenus = null, actions = Action("subUri1.4")),
            Menu(135, "SubTitle 1.5", "SubDescription 1.5", subMenus = null, actions = Action("subUri1.5"))
        ), actions = Action("uri1")),
        Menu(14, "Title 2", "Description 2", subMenus = listOf(
            Menu(141, "SubTitle 2.1", "SubDescription 2.1", subMenus = null, actions = Action("subUri2.1")),
            Menu(142, "SubTitle 2.2", "SubDescription 2.2", subMenus = null, actions = Action("subUri2.2")),
            Menu(143, "SubTitle 2.3", "SubDescription 2.3", subMenus = null, actions = Action("subUri2.3")),
            Menu(144, "SubTitle 2.4", "SubDescription 2.4", subMenus = null, actions = Action("subUri2.4")),
            Menu(145, "SubTitle 2.5", "SubDescription 2.5", subMenus = null, actions = Action("subUri2.5")),
            Menu(146, "SubTitle 2.6", "SubDescription 2.6", subMenus = null, actions = Action("subUri2.6")),
            Menu(147, "SubTitle 2.7", "SubDescription 2.7", subMenus = null, actions = Action("subUri2.7")),
            Menu(148, "SubTitle 2.8", "SubDescription 2.8", subMenus = null, actions = Action("subUri2.8")),
            Menu(149, "SubTitle 2.9", "SubDescription 2.9", subMenus = null, actions = Action("subUri2.9")),
        ), actions = Action("uri2")),
        Menu(15, "Title 3", "Description 3", subMenus = null, actions = Action("uri3")),
        Menu(16, "Title 4", "Description 4", subMenus = listOf(
            Menu(161, "SubTitle 4.1", "SubDescription 4.1", subMenus = null, actions = Action("subUri4.1")),
            Menu(162, "SubTitle 4.2", "SubDescription 4.2", subMenus = null, actions = Action("subUri4.2")),
            Menu(163, "SubTitle 4.3", "SubDescription 4.3", subMenus = null, actions = Action("subUri4.3")),
            Menu(164, "SubTitle 4.4", "SubDescription 4.4", subMenus = null, actions = Action("subUri4.4")),
            Menu(165, "SubTitle 4.5", "SubDescription 4.5", subMenus = null, actions = Action("subUri4.5"))
        ), actions = Action("uri4")),
    )
}