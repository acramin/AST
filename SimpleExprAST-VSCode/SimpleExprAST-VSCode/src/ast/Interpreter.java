package ast;

import ast.expr.DivExpr;
import ast.expr.IdExpr;
import ast.expr.DoubleConstExpr;
import ast.expr.MulExpr;
import ast.expr.NegatedExpr;
import ast.expr.SubExpr;
import ast.expr.SumExpr;
import ast.expr.ModExpr;
import ast.expr.ExpExpr;
import ast.expr.SinExpr;
import ast.expr.CosExpr;
import ast.expr.PiExpr;

public class Interpreter implements CodeVisitor {

    @Override
    public Double visit(SumExpr e) {
        return e.e1.accept(this) + e.e2.accept(this);
    }

    @Override
    public Double visit(SubExpr e) {
        return e.e1.accept(this) - e.e2.accept(this);
    }

    @Override
    public Double visit(MulExpr e) {
        return e.e1.accept(this) * e.e2.accept(this);
    }

    @Override
    public Double visit(DivExpr e) {
        return e.e1.accept(this) / e.e2.accept(this);
    }

    @Override
    public Double visit(IdExpr e) {
        return e.value;
    }

    @Override
    public Double visit(DoubleConstExpr e) {
        return e.value;
    }

    @Override
    public Double visit(NegatedExpr e) {
        return -e.expr.accept(this);
    }

    @Override
    public Double visit(ModExpr e) {
        return e.e1.accept(this) % e.e2.accept(this);
    }

    @Override
    public Double visit(ExpExpr e) {
        return Math.pow(e.e1.accept(this), e.e2.accept(this));
    }

    @Override
    public Double visit(SinExpr e) {
        return Math.sin(e.e.accept(this));
    }

    @Override
    public Double visit(CosExpr e) {
        return Math.cos(e.e.accept(this));
    }

    @Override
    public Double visit(PiExpr e) {
        return e.value;
    }
}
