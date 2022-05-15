package clike

import clike.node.*

class CLikeVisitorImpl : CLikeLangBaseVisitor<CLikeNode>() {

    override fun visitStart(ctx: CLikeLangParser.StartContext): CLikeNode {
        return visit(ctx.stat())
    }

    override fun visitAssign(ctx: CLikeLangParser.AssignContext): CLikeNode {
        return Assigment(ctx.NAME().text, visit(ctx.exp()))
    }

    override fun visitWhile(ctx: CLikeLangParser.WhileContext): CLikeNode {
        return While(visit(ctx.cond), visit(ctx.block))
    }

    override fun visitIf(ctx: CLikeLangParser.IfContext): CLikeNode {
        val right = if (ctx.elseBlock != null) visit(ctx.elseBlock) else null
        return If(visit(ctx.cond), visit(ctx.ifBlock), right)
    }

    override fun visitExpression(ctx: CLikeLangParser.ExpressionContext): CLikeNode {
        return visit(ctx.exp())
    }

    override fun visitAddSub(ctx: CLikeLangParser.AddSubContext): CLikeNode {
        return Binary(visit(ctx.l), visit(ctx.r), ctx.op.text[0])
    }

    override fun visitUnaryInt(ctx: CLikeLangParser.UnaryIntContext): CLikeNode {
        return Unary(visit(ctx.arithExp()), ctx.op.text[0])
    }

    override fun visitMyInt(ctx: CLikeLangParser.MyIntContext): CLikeNode {
        return MyInt(ctx.INT().text.toInt())
    }

    override fun visitPower(ctx: CLikeLangParser.PowerContext): CLikeNode {
        return Binary(visit(ctx.l), visit(ctx.r), ctx.op.text[0])
    }

    override fun visitMulDiv(ctx: CLikeLangParser.MulDivContext): CLikeNode {
        return Binary(visit(ctx.l), visit(ctx.r), ctx.op.text[0])
    }

    override fun visitAndOr(ctx: CLikeLangParser.AndOrContext): CLikeNode {
        return Binary(visit(ctx.l), visit(ctx.r), ctx.op.text[0])
    }

    override fun visitMyString(ctx: CLikeLangParser.MyStringContext): CLikeNode {
        return MyString(ctx.NAME().text)
    }

    override fun visitCompare(ctx: CLikeLangParser.CompareContext): CLikeNode {
        return Binary(visit(ctx.l), visit(ctx.r), ctx.op.text[0])
    }

    override fun visitUnaryBool(ctx: CLikeLangParser.UnaryBoolContext): CLikeNode {
        return Unary(visit(ctx.boolExp()), ctx.op.text[0])
    }
}