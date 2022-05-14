package main

import arith.ArithLexer
import arith.ArithParser
import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

fun main() {
    val input = CharStreams.fromString("5*18")
    val lexer = ArithLexer(input)
    val tokens = CommonTokenStream(lexer)
    val parser = ArithParser(tokens)
    val rootNode = parser.start()
    val rootNodeGood = MyArithVisitor().visit(rootNode)
    println(rootNodeGood)
}