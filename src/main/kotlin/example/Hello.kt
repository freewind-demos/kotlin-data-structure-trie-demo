package example

data class TrieNode(val data: Char?, val children: MutableSet<TrieNode>)

fun applyItemToTrie(trie: TrieNode, item: String): TrieNode {
    return trie.apply {
        var currentNode = trie
        item.toCharArray().forEach { char ->
            val existNode = currentNode.children.find { it.data == char }
            currentNode = existNode ?: run {
                val newNode = TrieNode(char, mutableSetOf())
                currentNode.children.add(newNode)
                newNode
            }
        }
    }
}

fun buildTrie(data: List<String>): TrieNode {
    val root = TrieNode(null, mutableSetOf())
    data.forEach { applyItemToTrie(root, it) }
    return root
}

fun main(args: Array<String>) {
    val data = listOf(
            "hello",
            "hi",
            "heleee",
            "key",
            "kee"
    )

    val trie = buildTrie(data)
    println(trie)
}
