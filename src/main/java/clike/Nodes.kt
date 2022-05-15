package clike.node

interface CLikeNode

data class Assigment(val name: String, val value: CLikeNode) : CLikeNode
data class MyString(val value: String) : CLikeNode
data class MyInt(val value: Int) : CLikeNode
data class Binary(val left: CLikeNode, val right: CLikeNode, val operation: Char) : CLikeNode
data class Unary(val left: CLikeNode, val operation: Char) : CLikeNode
data class If(val condition: CLikeNode, val thenBlock: CLikeNode, val elseBlock: CLikeNode?) : CLikeNode
data class While(val condition: CLikeNode, val block: CLikeNode) : CLikeNode