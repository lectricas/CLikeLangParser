package main

import arith.ArithBaseVisitor
import arith.ArithParser

class MyArithVisitor : ArithBaseVisitor<ArithNode>() {

    override fun visitNumber(ctx: ArithParser.NumberContext): ArithNode {
        val numNode = createNumNode(ctx.text)
        println("num" + numNode)
        return numNode
    }

    override fun visitBinaryOperation(ctx: ArithParser.BinaryOperationContext): ArithNode {
        val left = visit(ctx.e1);
        val right = visit(ctx.e2);
        val binNode = createBinOpNode(left, right, ctx.operation.text[0])
        println("bin" + binNode)
        return binNode
    }

    override fun visitBrackets(ctx: ArithParser.BracketsContext?): ArithNode {
        val visited = super.visitBrackets(ctx)
        println("brac" + visited)
        return visited;
    }
}