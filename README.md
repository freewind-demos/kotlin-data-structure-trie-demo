Kotlin Data Structure Trie Demo
===============================

Trie又称字典树、前缀树，特点：

1. 每个节点为一个基本元素（字母、数字等）
2. 每个从根到叶子节点的完整路径表示一个完整数据

Run `Hello.kt` in your IDE.

Result (formatted):

```
TrieNode(data=null, children=[
  TrieNode(data=h, children=[
    TrieNode(data=e, children=[
      TrieNode(data=l, children=[
        TrieNode(data=l, children=[
          TrieNode(data=o, children=[])
        ]),
        TrieNode(data=e, children=[
          TrieNode(data=e, children=[
            TrieNode(data=e, children=[])
          ])
        ])
      ])
    ]),
    TrieNode(data=i, children=[])
  ]),
  TrieNode(data=k, children=[
    TrieNode(data=e, children=[
      TrieNode(data=y, children=[]),
      TrieNode(data=e, children=[])
    ])
  ])
])
```