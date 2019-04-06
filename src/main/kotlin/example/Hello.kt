package example

data class TreeNode(val data: String, val children: Set<TreeNode>)


fun main(args: Array<String>) {
    val tree = TreeNode("aaa", children = setOf(
            TreeNode("bbb", children = setOf(
                    TreeNode("ccc", emptySet())
            )),
            TreeNode("ddd", children = setOf(
                    TreeNode("eee", emptySet()),
                    TreeNode("fff", emptySet()),
                    TreeNode("ggg", emptySet())
            )),
            TreeNode("hhh", children = emptySet())
    ))

    println(tree)
}
