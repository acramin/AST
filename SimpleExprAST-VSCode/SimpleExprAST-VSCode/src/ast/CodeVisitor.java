package ast;

import ast.expr.SumExpr;
import ast.expr.MulExpr;
import ast.expr.SubExpr;
import ast.expr.DivExpr;
import ast.expr.IdExpr;
import ast.expr.DoubleConstExpr;
import ast.expr.NegatedExpr;

public interface CodeVisitor {
    public Double visit(SumExpr e);

    public Double visit(SubExpr e);

    public Double visit(MulExpr e);

    public Double visit(DivExpr e);

    public Double visit(IdExpr e);

    public Double visit(DoubleConstExpr e);

    public Double visit(NegatedExpr e);
}
