package decaf;

import decaf.generated.*;

class DecafSemanticVisitor extends DecafBaseVisitor<DecafType> {
  @Override
  public DecafType visitIntLiteral(DecafParser.IntLiteralContext ctx) {
    return DecafType.INT;
  }

  @Override
  public DecafType visitAddExpr(DecafParser.AddExprContext ctx) throws RuntimeException {
    DecafType left = visit(ctx.expr(0));
    DecafType right = visit(ctx.expr(1));
    if (left != DecafType.INT || right != DecafType.INT) {
      throw new RuntimeException("Invalid types");
    }
    return DecafType.INT;
  }
}
