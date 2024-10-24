package ast.expr;

import ast.CodeVisitor;

public class CosExpr implements Expr{
    public Expr e;

    public CosExpr(Expr e) {
        this.e = e;
    }

    @Override
    public Double accept(CodeVisitor v) {
        return v.visit(this);
    }
}
