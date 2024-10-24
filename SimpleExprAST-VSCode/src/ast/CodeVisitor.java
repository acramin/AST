package ast;

import ast.expr.SumExpr;
import ast.expr.MulExpr;
import ast.expr.SubExpr;
import ast.expr.DivExpr;
import ast.expr.IdExpr;
import ast.expr.DoubleConstExpr;
import ast.expr.NegatedExpr;
import ast.expr.ModExpr;
import ast.expr.ExpExpr;
import ast.expr.SinExpr;
import ast.expr.CosExpr;
import ast.expr.PiExpr;

public interface CodeVisitor {
    public Double visit(SumExpr e);

    public Double visit(SubExpr e);

    public Double visit(MulExpr e);

    public Double visit(DivExpr e);

    public Double visit(IdExpr e);

    public Double visit(DoubleConstExpr e);

    public Double visit(NegatedExpr e);

    public Double visit(ModExpr e);

    public Double visit(ExpExpr e);

    public Double visit(SinExpr e);

    public Double visit(CosExpr e);

    public Double visit(PiExpr e);
}
