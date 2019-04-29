package decaf;

import decaf.generated.*;

class DecafSemanticVisitor extends DecafBaseVisitor<DecafType> {
	private Scopes scopes;

	DecafSemanticVisitor() {
		this.super();
		this.scopes = new Scopes();
	}

	public DecafType visitFieldDeclItem(DecafParser.FieldDeclItemContext ctx) {
		// TODO: Implement this 
	}

	public DecafType visitIdLocation(DecafParser.IdLocationContext ctx) {
		String id = ctx.expr(0);
		return scopes.lookupVar(id);
	}

	@Override
	public DecafType visitBoolLiteral(DecafParser.BoolLiteralContext ctx) {
		return DecafType.BOOL;
	}

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

	@Override
	public DecafType visitBoolExpr(DecafParser.BoolExprContext ctx) throws RuntimeException {
		DecafType left = visit(ctx.expr(0));
		DecafType right = visit(ctx.expr(1));
		if (left != DecafType.BOOL || right != DecafType.BOOL) {
			throw new RuntimeException("Invalid types");
		}
		return DecafType.BOOL;
	}

	@Override
	public DecafType visitCompExpr(DecafParser.CompExprContext ctx) throws RuntimeException {
		DecafType left = visit(ctx.expr(0));
		DecafType right = visit(ctx.expr(1));
		if (left != right || left == DecafType.VOID || right == DecafType.VOID) {
			throw new RuntimeException("Invalid types");
		}
		return DecafType.BOOL;
	}

	@Override
	public DecafType visitIfStmt(DecafParser.IfStmtContext ctx) {
		return DecafType.VOID;
	}

	@Override
	public DecafType visitForStmt(DecafParser.ForStmtContext ctx) {
		return DecafType.VOID;
	}

	@Override
	public DecafType visitBreakStmt(DecafParser.BreakStmtContext ctx) {
		return DecafType.VOID;
	}

	@Override
	public DecafType visitContinueStmt(DecafParser.ContinueStmtContext ctx) {
		return DecafType.VOID;
	}
}
