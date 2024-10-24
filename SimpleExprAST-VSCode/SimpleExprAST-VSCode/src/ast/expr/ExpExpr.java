package ast.expr;

import ast.CodeVisitor;

public class ExpExpr implements Expr{
    public Expr e1, e2;

    public ExpExpr(Expr e1, Expr e2) {
        this.e1 = e1;
        this.e2 = e2;
    }

    @Override
    public Double accept(CodeVisitor v) {
        return v.visit(this);
    }

}
