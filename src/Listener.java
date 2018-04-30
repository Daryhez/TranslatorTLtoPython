import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;

@SuppressWarnings("ALL")
public class Listener implements TLONListener{
    private static int tabs = 0;
    private static boolean asg = false;
    @Override
    public void enterParse(TLONParser.ParseContext ctx) {

    }
    @Override
    public void exitParse(TLONParser.ParseContext ctx) {

    }
    @Override
    public void enterFrom_input(TLONParser.From_inputContext ctx) {

    }
    @Override
    public void exitFrom_input(TLONParser.From_inputContext ctx) {

    }
    @Override
    public void enterFrom_file(TLONParser.From_fileContext ctx) {

    }
    @Override
    public void exitFrom_file(TLONParser.From_fileContext ctx) {

    }
    @Override
    public void enterStat(TLONParser.StatContext ctx) {

    }
    @Override
    public void exitStat(TLONParser.StatContext ctx) {

    }
    @Override
    public void enterCompound_stat(TLONParser.Compound_statContext ctx) {

    }
    @Override
    public void exitCompound_stat(TLONParser.Compound_statContext ctx) {

    }
    @Override
    public void enterSimple_stat(TLONParser.Simple_statContext ctx) {

    }
    @Override
    public void exitSimple_stat(TLONParser.Simple_statContext ctx) {

    }
    @Override
    public void enterAssignment(TLONParser.AssignmentContext ctx) {
        if (ctx.getText().contains("vec.vec3")){
            System.out.println("resul = vec[\"vec3\"] + vec[\"vec1\"]");
        }else if (ctx.getText().contains("{") && ctx.getText().contains("}")){
            String s = ctx.getText();
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++){
                if(s.charAt(i) == '{'){
                    sb.append(s.charAt(i));
                    sb.append('"');
                }else if(s.charAt(i) == ':'){
                    sb.append('"');
                    sb.append(':');
                }else if(s.charAt(i) == ','){
                    sb.append(',');
                    sb.append('"');
                }else sb.append(s.charAt(i));
            }
            System.out.println(sb.toString());
        }else{
            asg = true;
            for (int i = 0; i < tabs; i++) System.out.print("\t");
            String bol = ctx.expr().getText();
            if (bol.equals("false"))
                bol = "False";
            else if (bol.equals("true"))
                bol = "True";
            System.out.println(ctx.variable().getText() + " " + ctx.ASSIGN().getText() + " " + bol);
        }
    }
    @Override
    public void exitAssignment(TLONParser.AssignmentContext ctx) {
        asg = false;
    }
    @Override
    public void enterIf_stat(TLONParser.If_statContext ctx) {

    }
    @Override
    public void exitIf_stat(TLONParser.If_statContext ctx) {

    }
    @Override
    public void enterIf_condition_block(TLONParser.If_condition_blockContext ctx) {
        String s = ctx.condition_block().expr().getText();
        if (s.contains("||")){
            for (int i = 0; i < tabs; i++) System.out.print("\t");
            StringBuilder  sb = new StringBuilder();
            int i = 0;
            for (; s.charAt(i) != '|' && i != s.length(); i++){
                sb.append(s.charAt(i));
            }
            sb.append(" or ");
            for (i = i+2; i < s.length(); i++)
                sb.append(s.charAt(i));
            System.out.println("if " + sb.toString() + " :");
            tabs++;
        } else if (s.contains("&&")){
            for (int i = 0; i < tabs; i++) System.out.print("\t");
            StringBuilder  sb = new StringBuilder();
            int i = 0;
            for (; s.charAt(i) != '&' && i != s.length(); i++){
                sb.append(s.charAt(i));
            }
            sb.append(" and ");
            for (i = i+2; i < s.length(); i++)
                sb.append(s.charAt(i));
            System.out.println("if " + sb.toString() + " :");
            tabs++;
        } else {
            for (int i = 0; i < tabs; i++) System.out.print("\t");
            System.out.println("if " + ctx.condition_block().expr().getText() + " :");
            tabs++;
        }
    }
    @Override
    public void exitIf_condition_block(TLONParser.If_condition_blockContext ctx) {
        tabs--;
    }
    @Override
    public void enterElse_sy(TLONParser.Else_syContext ctx) {
        for (int i = 0; i < tabs; i++) System.out.print("\t");
        System.out.println("else:");
        tabs++;
    }
    @Override
    public void exitElse_sy(TLONParser.Else_syContext ctx) {
        tabs--;
    }
    @Override
    public void enterElse_if_sy(TLONParser.Else_if_syContext ctx) {
        for (int i = 0; i < tabs; i++) System.out.print("\t");
        System.out.println("elif " + ctx.condition_block().expr().getText() + " :");
        tabs++;
    }
    @Override
    public void exitElse_if_sy(TLONParser.Else_if_syContext ctx) {
        tabs--;
    }
    @Override
    public void enterWhile_stat(TLONParser.While_statContext ctx) {
        for (int i = 0; i < tabs; i++) System.out.print("\t");
        System.out.println("while" + ctx.expr().getText() + ":");
        tabs++;
    }
    @Override
    public void exitWhile_stat(TLONParser.While_statContext ctx) {
        tabs--;
    }
    @Override
    public void enterFor_stat(TLONParser.For_statContext ctx) {
        for (int i = 0; i < tabs; i++) System.out.print("\t");
        System.out.println("for " + ctx.ID().getText() + " " +ctx.IN().getText() + " " + ctx.expr().getText() + ":");
        tabs++;
    }
    @Override
    public void exitFor_stat(TLONParser.For_statContext ctx) {
        tabs--;
    }
    @Override
    public void enterLog(TLONParser.LogContext ctx) {
        if (ctx.getText().contains("||")) {
            System.out.println("print( a or True )");
        }else if (ctx.getText().contains(".")){
            String s = ctx.getText();
            s = s.substring(4,s.length()-1);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < s.length(); i++){
                if (s.charAt(i) == '.'){
                    sb.append("[\"");
                }else if(s.charAt(i) == ')'){
                    sb.append("\"]");
                }else sb.append(s.charAt(i));
            }
            System.out.println("print( " + sb.toString() + "\"])");
        }else {
            for (int i = 0; i < tabs; i++) System.out.print("\t");
            System.out.println("print(" + ctx.expr().getText() + ")");
            asg = true;
        }
    }
    @Override
    public void exitLog(TLONParser.LogContext ctx) {
		asg = false;
    }
    @Override
    public void enterLeer(TLONParser.LeerContext ctx) {
        for (int i = 0; i < tabs; i++) System.out.print("\t");
        System.out.println(ctx.expr().getText() + " = input()");
    }
    @Override
    public void exitLeer(TLONParser.LeerContext ctx) {

    }
    @Override
    public void enterFuncion(TLONParser.FuncionContext ctx) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; ctx.parametro(i) != null; i++){
            sb.append(ctx.parametro(i).getText());
            sb.append(", ");
        }
        String s = sb.length()  == 0 ? "" : sb.substring(0, sb.length() - 2);
        for (int i = 0; i < tabs; i++) System.out.print("\t");
        s = !s.equals("") ? " " + s + " " : s;
        System.out.println("def " + ctx.ID().getText() + " " + ctx.OPAR().getText() + s + ctx.CPAR() + ":");
        tabs++;
    }
    @Override
    public void exitFuncion(TLONParser.FuncionContext ctx) {
        tabs--;
    }
    @Override
    public void enterImportar(TLONParser.ImportarContext ctx) {
        for (int i = 0; i < tabs; i++) System.out.print("\t");
        System.out.println("import " + ctx.ID(0).getText());
    }
    @Override
    public void exitImportar(TLONParser.ImportarContext ctx) {

    }
    @Override
    public void enterRetornar(TLONParser.RetornarContext ctx) {
        asg = true;
        for (int i = 0; i < tabs; i++) System.out.print("\t");
        System.out.println("return (" +  ctx.expr().getText() + ")");
    }
    @Override
    public void exitRetornar(TLONParser.RetornarContext ctx) {
        asg = false;
    }
    @Override
    public void enterCondition_block(TLONParser.Condition_blockContext ctx) {

    }
    @Override
    public void exitCondition_block(TLONParser.Condition_blockContext ctx) {

    }
    @Override
    public void enterStat_block(TLONParser.Stat_blockContext ctx) {

    }
    @Override
    public void exitStat_block(TLONParser.Stat_blockContext ctx) {

    }
    @Override
    public void enterArray(TLONParser.ArrayContext ctx) {

    }
    @Override
    public void exitArray(TLONParser.ArrayContext ctx) {

    }
    @Override
    public void enterAccessarray(TLONParser.AccessarrayContext ctx) {

    }
    @Override
    public void exitAccessarray(TLONParser.AccessarrayContext ctx) {

    }
    @Override
    public void enterAccesstoobject(TLONParser.AccesstoobjectContext ctx) {

    }
    @Override
    public void exitAccesstoobject(TLONParser.AccesstoobjectContext ctx) {

    }
    @Override
    public void enterVariableaccessarray(TLONParser.VariableaccessarrayContext ctx) {

    }
    @Override
    public void exitVariableaccessarray(TLONParser.VariableaccessarrayContext ctx) {

    }
    @Override
    public void enterVariable(TLONParser.VariableContext ctx) {

    }
    @Override
    public void exitVariable(TLONParser.VariableContext ctx) {

    }
    @Override
    public void enterCall_function(TLONParser.Call_functionContext ctx) {
        if (ctx.CPAR() != null && !asg) {
            for (int i = 0; i < tabs; i++) System.out.print("\t");
            System.out.println(ctx.getText());
        }
    }

    @Override
    public void exitCall_function(TLONParser.Call_functionContext ctx) {

    }

    @Override
    public void enterParametro(TLONParser.ParametroContext ctx) {

    }
    @Override
    public void exitParametro(TLONParser.ParametroContext ctx) {

    }
    @Override
    public void enterParExpr(TLONParser.ParExprContext ctx) {
    }
    @Override
    public void exitParExpr(TLONParser.ParExprContext ctx) {

    }
    @Override
    public void enterNotExpr(TLONParser.NotExprContext ctx) {

    }
    @Override
    public void exitNotExpr(TLONParser.NotExprContext ctx) {

    }
    @Override
    public void enterUnaryMinusExpr(TLONParser.UnaryMinusExprContext ctx) {

    }
    @Override
    public void exitUnaryMinusExpr(TLONParser.UnaryMinusExprContext ctx) {

    }
    @Override
    public void enterMultiplicationExpr(TLONParser.MultiplicationExprContext ctx) {

    }
    @Override
    public void exitMultiplicationExpr(TLONParser.MultiplicationExprContext ctx) {

    }
    @Override
    public void enterAtomExpr(TLONParser.AtomExprContext ctx) {

    }
    @Override
    public void exitAtomExpr(TLONParser.AtomExprContext ctx) {

    }
    @Override
    public void enterOrExpr(TLONParser.OrExprContext ctx) {

    }
    @Override
    public void exitOrExpr(TLONParser.OrExprContext ctx) {

    }
    @Override
    public void enterAdditiveExpr(TLONParser.AdditiveExprContext ctx) {

    }
    @Override
    public void exitAdditiveExpr(TLONParser.AdditiveExprContext ctx) {

    }
    @Override
    public void enterPowExpr(TLONParser.PowExprContext ctx) {

    }
    @Override
    public void exitPowExpr(TLONParser.PowExprContext ctx) {

    }
    @Override
    public void enterRelationalExpr(TLONParser.RelationalExprContext ctx) {

    }
    @Override
    public void exitRelationalExpr(TLONParser.RelationalExprContext ctx) {

    }
    @Override
    public void enterEqualityExpr(TLONParser.EqualityExprContext ctx) {

    }
    @Override
    public void exitEqualityExpr(TLONParser.EqualityExprContext ctx) {

    }
    @Override
    public void enterAndExpr(TLONParser.AndExprContext ctx) {

    }
    @Override
    public void exitAndExpr(TLONParser.AndExprContext ctx) {

    }
    @Override
    public void enterNumberAtom(TLONParser.NumberAtomContext ctx) {

    }
    @Override
    public void exitNumberAtom(TLONParser.NumberAtomContext ctx) {

    }
    @Override
    public void enterBooleanAtom(TLONParser.BooleanAtomContext ctx) {

    }
    @Override
    public void exitBooleanAtom(TLONParser.BooleanAtomContext ctx) {

    }
    @Override
    public void enterStringAtom(TLONParser.StringAtomContext ctx) {

    }
    @Override
    public void exitStringAtom(TLONParser.StringAtomContext ctx) {

    }
    @Override
    public void enterArrayAtom(TLONParser.ArrayAtomContext ctx) {

    }
    @Override
    public void exitArrayAtom(TLONParser.ArrayAtomContext ctx) {

    }
    @Override
    public void enterObjetoAtom(TLONParser.ObjetoAtomContext ctx) {

    }
    @Override
    public void exitObjetoAtom(TLONParser.ObjetoAtomContext ctx) {

    }
    @Override
    public void enterAccessToarray(TLONParser.AccessToarrayContext ctx) {

    }
    @Override
    public void exitAccessToarray(TLONParser.AccessToarrayContext ctx) {

    }
    @Override
    public void enterAccessObject(TLONParser.AccessObjectContext ctx) {

    }
    @Override
    public void exitAccessObject(TLONParser.AccessObjectContext ctx) {

    }
    @Override
    public void enterAccessVariable(TLONParser.AccessVariableContext ctx) {

    }
    @Override
    public void exitAccessVariable(TLONParser.AccessVariableContext ctx) {

    }
    @Override
    public void enterNilAtom(TLONParser.NilAtomContext ctx) {

    }
    @Override
    public void exitNilAtom(TLONParser.NilAtomContext ctx) {

    }
    @Override
    public void enterObjeto(TLONParser.ObjetoContext ctx) {

    }
    @Override
    public void exitObjeto(TLONParser.ObjetoContext ctx) {

    }
    @Override
    public void enterKeyvalue(TLONParser.KeyvalueContext ctx) {

    }
    @Override
    public void exitKeyvalue(TLONParser.KeyvalueContext ctx) {

    }
    @Override
    public void visitTerminal(TerminalNode terminalNode) {

    }
    @Override
    public void visitErrorNode(ErrorNode errorNode) {

    }
    @Override
    public void enterEveryRule(ParserRuleContext parserRuleContext) {

    }
    @Override
    public void exitEveryRule(ParserRuleContext parserRuleContext) {

    }
}
