package main

interface ArithNode {
    fun eval(): Int
}

data class NumNode (val n: Int) : ArithNode {
    override fun eval(): Int {
        return n
    }
}
data class BinOpNode (val e1: ArithNode, val e2: ArithNode, val binOp: Char) : ArithNode {
    override fun eval(): Int {
        println(binOp)
        //TODO
        return e1.eval() + e2.eval()
    }
}

fun createNumNode(n : String): ArithNode {
    return NumNode(Integer.parseInt(n))
}

fun createBinOpNode(e1: ArithNode, e2: ArithNode, binOp: Char): ArithNode {
    return BinOpNode(e1, e2, binOp)
}

