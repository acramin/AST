package ast.expr;

import ast.CodeVisitor;

public class SinExpr implements Expr {
    public Expr e;

    public SinExpr(Expr e) {
        this.e = e;
    }

    @Override
    public Double accept(CodeVisitor v) {
        return v.visit(this);
    }
}