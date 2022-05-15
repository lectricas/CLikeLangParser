package clike

import org.antlr.v4.runtime.CharStreams
import org.antlr.v4.runtime.CommonTokenStream

fun main() {
    val input = CharStreams.fromString("if (a < 3 && b > 4) then {a=4}")
    val lexer = CLikeLangLexer(input)
    val tokens = CommonTokenStream(lexer)
    val parser = CLikeLangParser(tokens)
    val rootNode = parser.start()
    val rootNodeGood = CLikeVisitorImpl().visit(rootNode)
    println(rootNodeGood)
}