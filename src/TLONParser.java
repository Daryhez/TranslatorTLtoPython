// Generated from TLON.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class TLONParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		OR=1, AND=2, EQ=3, NEQ=4, GT=5, LT=6, GTEQ=7, LTEQ=8, PLUS=9, MINUS=10, 
		MULT=11, DIV=12, MOD=13, POW=14, NOT=15, ASSIGN=16, OPAR=17, CPAR=18, 
		OBRACE=19, CBRACE=20, OKEY=21, CKEY=22, COMMA=23, POINTS=24, TRUE=25, 
		FALSE=26, NIL=27, IF=28, ELSE=29, WHILE=30, LOG=31, LEER=32, FOR=33, IN=34, 
		FUNCION=35, END=36, RETORNO=37, IMPORT=38, FROM=39, ASTERISC=40, POINT=41, 
		ID=42, INT=43, FLOAT=44, STRING=45, COMMENT=46, SPACE=47, NEWLINE=48, 
		OTHER=49;
	public static final int
		RULE_parse = 0, RULE_from_input = 1, RULE_from_file = 2, RULE_stat = 3, 
		RULE_compound_stat = 4, RULE_simple_stat = 5, RULE_assignment = 6, RULE_if_stat = 7, 
		RULE_while_stat = 8, RULE_for_stat = 9, RULE_log = 10, RULE_leer = 11, 
		RULE_funcion = 12, RULE_importar = 13, RULE_retornar = 14, RULE_condition_block = 15, 
		RULE_stat_block = 16, RULE_array = 17, RULE_accessarray = 18, RULE_accesstoobject = 19, 
		RULE_variableaccessarray = 20, RULE_variable = 21, RULE_parametro = 22, 
		RULE_expr = 23, RULE_atom = 24, RULE_objeto = 25, RULE_keyvalue = 26;
	public static final String[] ruleNames = {
		"parse", "from_input", "from_file", "stat", "compound_stat", "simple_stat", 
		"assignment", "if_stat", "while_stat", "for_stat", "log", "leer", "funcion", 
		"importar", "retornar", "condition_block", "stat_block", "array", "accessarray", 
		"accesstoobject", "variableaccessarray", "variable", "parametro", "expr", 
		"atom", "objeto", "keyvalue"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'||'", "'&&'", "'=='", "'!='", "'>'", "'<'", "'>='", "'<='", "'+'", 
		"'-'", "'*'", "'/'", "'%'", "'^'", "'!'", "'='", "'('", "')'", "'{'", 
		"'}'", "'['", "']'", "','", "':'", "'true'", "'false'", "'nil'", "'if'", 
		"'else'", "'while'", "'log'", "'leer'", "'for'", "'in'", "'funcion'", 
		"'end'", "'retorno'", "'importar'", "'desde'", "'todo'", "'.'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "OR", "AND", "EQ", "NEQ", "GT", "LT", "GTEQ", "LTEQ", "PLUS", "MINUS", 
		"MULT", "DIV", "MOD", "POW", "NOT", "ASSIGN", "OPAR", "CPAR", "OBRACE", 
		"CBRACE", "OKEY", "CKEY", "COMMA", "POINTS", "TRUE", "FALSE", "NIL", "IF", 
		"ELSE", "WHILE", "LOG", "LEER", "FOR", "IN", "FUNCION", "END", "RETORNO", 
		"IMPORT", "FROM", "ASTERISC", "POINT", "ID", "INT", "FLOAT", "STRING", 
		"COMMENT", "SPACE", "NEWLINE", "OTHER"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "TLON.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public TLONParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public From_inputContext from_input() {
			return getRuleContext(From_inputContext.class,0);
		}
		public From_fileContext from_file() {
			return getRuleContext(From_fileContext.class,0);
		}
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterParse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitParse(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(54);
				from_input();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(55);
				from_file();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_inputContext extends ParserRuleContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(TLONParser.NEWLINE, 0); }
		public From_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_input; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterFrom_input(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitFrom_input(this);
		}
	}

	public final From_inputContext from_input() throws RecognitionException {
		From_inputContext _localctx = new From_inputContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_from_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(58);
			stat();
			setState(59);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class From_fileContext extends ParserRuleContext {
		public TerminalNode EOF() { return getToken(TLONParser.EOF, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(TLONParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(TLONParser.NEWLINE, i);
		}
		public From_fileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_from_file; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterFrom_file(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitFrom_file(this);
		}
	}

	public final From_fileContext from_file() throws RecognitionException {
		From_fileContext _localctx = new From_fileContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_from_file);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(65);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << OPAR) | (1L << OBRACE) | (1L << OKEY) | (1L << TRUE) | (1L << FALSE) | (1L << NIL) | (1L << IF) | (1L << WHILE) | (1L << LOG) | (1L << LEER) | (1L << FOR) | (1L << FUNCION) | (1L << IMPORT) | (1L << FROM) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << NEWLINE) | (1L << OTHER))) != 0)) {
				{
				setState(63);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case MINUS:
				case NOT:
				case OPAR:
				case OBRACE:
				case OKEY:
				case TRUE:
				case FALSE:
				case NIL:
				case IF:
				case WHILE:
				case LOG:
				case LEER:
				case FOR:
				case FUNCION:
				case IMPORT:
				case FROM:
				case ID:
				case INT:
				case FLOAT:
				case STRING:
				case OTHER:
					{
					setState(61);
					stat();
					}
					break;
				case NEWLINE:
					{
					setState(62);
					match(NEWLINE);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(68);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class StatContext extends ParserRuleContext {
		public Simple_statContext simple_stat() {
			return getRuleContext(Simple_statContext.class,0);
		}
		public Compound_statContext compound_stat() {
			return getRuleContext(Compound_statContext.class,0);
		}
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterStat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitStat(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_stat);
		try {
			setState(72);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
			case NOT:
			case OPAR:
			case OBRACE:
			case OKEY:
			case TRUE:
			case FALSE:
			case NIL:
			case LOG:
			case LEER:
			case IMPORT:
			case FROM:
			case ID:
			case INT:
			case FLOAT:
			case STRING:
			case OTHER:
				enterOuterAlt(_localctx, 1);
				{
				setState(70);
				simple_stat();
				}
				break;
			case IF:
			case WHILE:
			case FOR:
			case FUNCION:
				enterOuterAlt(_localctx, 2);
				{
				setState(71);
				compound_stat();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Compound_statContext extends ParserRuleContext {
		public If_statContext if_stat() {
			return getRuleContext(If_statContext.class,0);
		}
		public While_statContext while_stat() {
			return getRuleContext(While_statContext.class,0);
		}
		public For_statContext for_stat() {
			return getRuleContext(For_statContext.class,0);
		}
		public FuncionContext funcion() {
			return getRuleContext(FuncionContext.class,0);
		}
		public Compound_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_compound_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterCompound_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitCompound_stat(this);
		}
	}

	public final Compound_statContext compound_stat() throws RecognitionException {
		Compound_statContext _localctx = new Compound_statContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_compound_stat);
		try {
			setState(78);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IF:
				enterOuterAlt(_localctx, 1);
				{
				setState(74);
				if_stat();
				}
				break;
			case WHILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(75);
				while_stat();
				}
				break;
			case FOR:
				enterOuterAlt(_localctx, 3);
				{
				setState(76);
				for_stat();
				}
				break;
			case FUNCION:
				enterOuterAlt(_localctx, 4);
				{
				setState(77);
				funcion();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Simple_statContext extends ParserRuleContext {
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public LogContext log() {
			return getRuleContext(LogContext.class,0);
		}
		public LeerContext leer() {
			return getRuleContext(LeerContext.class,0);
		}
		public ImportarContext importar() {
			return getRuleContext(ImportarContext.class,0);
		}
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(TLONParser.NEWLINE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode OTHER() { return getToken(TLONParser.OTHER, 0); }
		public Simple_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simple_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterSimple_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitSimple_stat(this);
		}
	}

	public final Simple_statContext simple_stat() throws RecognitionException {
		Simple_statContext _localctx = new Simple_statContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_simple_stat);
		try {
			setState(89);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(80);
				assignment();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(81);
				log();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				leer();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(83);
				importar();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(84);
				atom();
				setState(85);
				match(NEWLINE);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(87);
				expr(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(88);
				match(OTHER);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AssignmentContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(TLONParser.ASSIGN, 0); }
		public AssignmentContext assignment() {
			return getRuleContext(AssignmentContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public AssignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterAssignment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitAssignment(this);
		}
	}

	public final AssignmentContext assignment() throws RecognitionException {
		AssignmentContext _localctx = new AssignmentContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(91);
			variable();
			setState(92);
			match(ASSIGN);
			setState(95);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(93);
				assignment();
				}
				break;
			case 2:
				{
				setState(94);
				expr(0);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class If_statContext extends ParserRuleContext {
		public List<TerminalNode> IF() { return getTokens(TLONParser.IF); }
		public TerminalNode IF(int i) {
			return getToken(TLONParser.IF, i);
		}
		public List<Condition_blockContext> condition_block() {
			return getRuleContexts(Condition_blockContext.class);
		}
		public Condition_blockContext condition_block(int i) {
			return getRuleContext(Condition_blockContext.class,i);
		}
		public List<TerminalNode> ELSE() { return getTokens(TLONParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(TLONParser.ELSE, i);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public If_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterIf_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitIf_stat(this);
		}
	}

	public final If_statContext if_stat() throws RecognitionException {
		If_statContext _localctx = new If_statContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_if_stat);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(97);
			match(IF);
			setState(98);
			condition_block();
			setState(104);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(99);
					match(ELSE);
					setState(100);
					match(IF);
					setState(101);
					condition_block();
					}
					} 
				}
				setState(106);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,7,_ctx);
			}
			setState(109);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(107);
				match(ELSE);
				setState(108);
				stat_block();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class While_statContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(TLONParser.WHILE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public While_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterWhile_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitWhile_stat(this);
		}
	}

	public final While_statContext while_stat() throws RecognitionException {
		While_statContext _localctx = new While_statContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_while_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(111);
			match(WHILE);
			setState(112);
			expr(0);
			setState(113);
			stat_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_statContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(TLONParser.FOR, 0); }
		public TerminalNode ID() { return getToken(TLONParser.ID, 0); }
		public TerminalNode IN() { return getToken(TLONParser.IN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public For_statContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_stat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterFor_stat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitFor_stat(this);
		}
	}

	public final For_statContext for_stat() throws RecognitionException {
		For_statContext _localctx = new For_statContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_for_stat);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(115);
			match(FOR);
			setState(116);
			match(ID);
			setState(117);
			match(IN);
			setState(118);
			expr(0);
			setState(119);
			stat_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LogContext extends ParserRuleContext {
		public TerminalNode LOG() { return getToken(TLONParser.LOG, 0); }
		public TerminalNode OPAR() { return getToken(TLONParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(TLONParser.CPAR, 0); }
		public LogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_log; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitLog(this);
		}
	}

	public final LogContext log() throws RecognitionException {
		LogContext _localctx = new LogContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_log);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(LOG);
			setState(122);
			match(OPAR);
			setState(123);
			expr(0);
			setState(124);
			match(CPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LeerContext extends ParserRuleContext {
		public TerminalNode LEER() { return getToken(TLONParser.LEER, 0); }
		public TerminalNode OPAR() { return getToken(TLONParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(TLONParser.CPAR, 0); }
		public LeerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leer; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterLeer(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitLeer(this);
		}
	}

	public final LeerContext leer() throws RecognitionException {
		LeerContext _localctx = new LeerContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_leer);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(LEER);
			setState(127);
			match(OPAR);
			setState(128);
			expr(0);
			setState(129);
			match(CPAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FuncionContext extends ParserRuleContext {
		public TerminalNode FUNCION() { return getToken(TLONParser.FUNCION, 0); }
		public TerminalNode ID() { return getToken(TLONParser.ID, 0); }
		public TerminalNode OPAR() { return getToken(TLONParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(TLONParser.CPAR, 0); }
		public RetornarContext retornar() {
			return getRuleContext(RetornarContext.class,0);
		}
		public TerminalNode END() { return getToken(TLONParser.END, 0); }
		public List<ParametroContext> parametro() {
			return getRuleContexts(ParametroContext.class);
		}
		public ParametroContext parametro(int i) {
			return getRuleContext(ParametroContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(TLONParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(TLONParser.NEWLINE, i);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TLONParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TLONParser.COMMA, i);
		}
		public FuncionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_funcion; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterFuncion(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitFuncion(this);
		}
	}

	public final FuncionContext funcion() throws RecognitionException {
		FuncionContext _localctx = new FuncionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_funcion);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(131);
			match(FUNCION);
			setState(132);
			match(ID);
			setState(133);
			match(OPAR);
			setState(142);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(134);
				parametro();
				setState(139);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(135);
					match(COMMA);
					setState(136);
					parametro();
					}
					}
					setState(141);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(144);
			match(CPAR);
			setState(149);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << OPAR) | (1L << OBRACE) | (1L << OKEY) | (1L << TRUE) | (1L << FALSE) | (1L << NIL) | (1L << IF) | (1L << WHILE) | (1L << LOG) | (1L << LEER) | (1L << FOR) | (1L << FUNCION) | (1L << IMPORT) | (1L << FROM) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << NEWLINE) | (1L << OTHER))) != 0)) {
				{
				setState(147);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NEWLINE:
					{
					setState(145);
					match(NEWLINE);
					}
					break;
				case MINUS:
				case NOT:
				case OPAR:
				case OBRACE:
				case OKEY:
				case TRUE:
				case FALSE:
				case NIL:
				case IF:
				case WHILE:
				case LOG:
				case LEER:
				case FOR:
				case FUNCION:
				case IMPORT:
				case FROM:
				case ID:
				case INT:
				case FLOAT:
				case STRING:
				case OTHER:
					{
					setState(146);
					stat();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				}
				setState(151);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(152);
			retornar();
			setState(153);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ImportarContext extends ParserRuleContext {
		public TerminalNode IMPORT() { return getToken(TLONParser.IMPORT, 0); }
		public List<TerminalNode> ID() { return getTokens(TLONParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLONParser.ID, i);
		}
		public List<TerminalNode> POINT() { return getTokens(TLONParser.POINT); }
		public TerminalNode POINT(int i) {
			return getToken(TLONParser.POINT, i);
		}
		public TerminalNode FROM() { return getToken(TLONParser.FROM, 0); }
		public ImportarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_importar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterImportar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitImportar(this);
		}
	}

	public final ImportarContext importar() throws RecognitionException {
		ImportarContext _localctx = new ImportarContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_importar);
		int _la;
		try {
			setState(168);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case IMPORT:
				enterOuterAlt(_localctx, 1);
				{
				setState(155);
				match(IMPORT);
				setState(156);
				match(ID);
				setState(161);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==POINT) {
					{
					{
					setState(157);
					match(POINT);
					setState(158);
					match(ID);
					}
					}
					setState(163);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				match(FROM);
				setState(165);
				match(ID);
				setState(166);
				match(IMPORT);
				setState(167);
				match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RetornarContext extends ParserRuleContext {
		public TerminalNode RETORNO() { return getToken(TLONParser.RETORNO, 0); }
		public TerminalNode OPAR() { return getToken(TLONParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(TLONParser.CPAR, 0); }
		public TerminalNode NEWLINE() { return getToken(TLONParser.NEWLINE, 0); }
		public RetornarContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_retornar; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterRetornar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitRetornar(this);
		}
	}

	public final RetornarContext retornar() throws RecognitionException {
		RetornarContext _localctx = new RetornarContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_retornar);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(170);
			match(RETORNO);
			setState(171);
			match(OPAR);
			setState(172);
			expr(0);
			setState(173);
			match(CPAR);
			setState(174);
			match(NEWLINE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_blockContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public Stat_blockContext stat_block() {
			return getRuleContext(Stat_blockContext.class,0);
		}
		public TerminalNode NEWLINE() { return getToken(TLONParser.NEWLINE, 0); }
		public Condition_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterCondition_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitCondition_block(this);
		}
	}

	public final Condition_blockContext condition_block() throws RecognitionException {
		Condition_blockContext _localctx = new Condition_blockContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_condition_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(176);
			expr(0);
			setState(178);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==NEWLINE) {
				{
				setState(177);
				match(NEWLINE);
				}
			}

			setState(180);
			stat_block();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stat_blockContext extends ParserRuleContext {
		public TerminalNode OBRACE() { return getToken(TLONParser.OBRACE, 0); }
		public TerminalNode CBRACE() { return getToken(TLONParser.CBRACE, 0); }
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public List<TerminalNode> NEWLINE() { return getTokens(TLONParser.NEWLINE); }
		public TerminalNode NEWLINE(int i) {
			return getToken(TLONParser.NEWLINE, i);
		}
		public Stat_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterStat_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitStat_block(this);
		}
	}

	public final Stat_blockContext stat_block() throws RecognitionException {
		Stat_blockContext _localctx = new Stat_blockContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_stat_block);
		int _la;
		try {
			setState(194);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(182);
				match(OBRACE);
				setState(187);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << OPAR) | (1L << OBRACE) | (1L << OKEY) | (1L << TRUE) | (1L << FALSE) | (1L << NIL) | (1L << IF) | (1L << WHILE) | (1L << LOG) | (1L << LEER) | (1L << FOR) | (1L << FUNCION) | (1L << IMPORT) | (1L << FROM) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING) | (1L << NEWLINE) | (1L << OTHER))) != 0)) {
					{
					setState(185);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case MINUS:
					case NOT:
					case OPAR:
					case OBRACE:
					case OKEY:
					case TRUE:
					case FALSE:
					case NIL:
					case IF:
					case WHILE:
					case LOG:
					case LEER:
					case FOR:
					case FUNCION:
					case IMPORT:
					case FROM:
					case ID:
					case INT:
					case FLOAT:
					case STRING:
					case OTHER:
						{
						setState(183);
						stat();
						}
						break;
					case NEWLINE:
						{
						setState(184);
						match(NEWLINE);
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(189);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(190);
				match(CBRACE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(191);
				stat();
				setState(192);
				match(NEWLINE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ArrayContext extends ParserRuleContext {
		public ExprContext start;
		public ExprContext step;
		public ExprContext end;
		public TerminalNode OKEY() { return getToken(TLONParser.OKEY, 0); }
		public TerminalNode CKEY() { return getToken(TLONParser.CKEY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TLONParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TLONParser.COMMA, i);
		}
		public List<TerminalNode> POINTS() { return getTokens(TLONParser.POINTS); }
		public TerminalNode POINTS(int i) {
			return getToken(TLONParser.POINTS, i);
		}
		public ArrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitArray(this);
		}
	}

	public final ArrayContext array() throws RecognitionException {
		ArrayContext _localctx = new ArrayContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_array);
		int _la;
		try {
			setState(219);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(196);
				match(OKEY);
				setState(205);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << OPAR) | (1L << OBRACE) | (1L << OKEY) | (1L << TRUE) | (1L << FALSE) | (1L << NIL) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
					{
					setState(197);
					expr(0);
					setState(202);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA) {
						{
						{
						setState(198);
						match(COMMA);
						setState(199);
						expr(0);
						}
						}
						setState(204);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(207);
				match(CKEY);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(208);
				match(OKEY);
				setState(209);
				((ArrayContext)_localctx).start = expr(0);
				setState(210);
				match(POINTS);
				setState(214);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,21,_ctx) ) {
				case 1:
					{
					setState(211);
					((ArrayContext)_localctx).step = expr(0);
					setState(212);
					match(POINTS);
					}
					break;
				}
				setState(216);
				((ArrayContext)_localctx).end = expr(0);
				setState(217);
				match(CKEY);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccessarrayContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode OKEY() { return getToken(TLONParser.OKEY, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CKEY() { return getToken(TLONParser.CKEY, 0); }
		public AccessarrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accessarray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterAccessarray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitAccessarray(this);
		}
	}

	public final AccessarrayContext accessarray() throws RecognitionException {
		AccessarrayContext _localctx = new AccessarrayContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_accessarray);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(221);
			variable();
			setState(222);
			match(OKEY);
			setState(223);
			expr(0);
			setState(224);
			match(CKEY);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AccesstoobjectContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public TerminalNode POINT() { return getToken(TLONParser.POINT, 0); }
		public VariableaccessarrayContext variableaccessarray() {
			return getRuleContext(VariableaccessarrayContext.class,0);
		}
		public AccesstoobjectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_accesstoobject; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterAccesstoobject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitAccesstoobject(this);
		}
	}

	public final AccesstoobjectContext accesstoobject() throws RecognitionException {
		AccesstoobjectContext _localctx = new AccesstoobjectContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_accesstoobject);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(226);
			variable();
			setState(227);
			match(POINT);
			setState(228);
			variableaccessarray();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableaccessarrayContext extends ParserRuleContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AccessarrayContext accessarray() {
			return getRuleContext(AccessarrayContext.class,0);
		}
		public VariableaccessarrayContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variableaccessarray; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterVariableaccessarray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitVariableaccessarray(this);
		}
	}

	public final VariableaccessarrayContext variableaccessarray() throws RecognitionException {
		VariableaccessarrayContext _localctx = new VariableaccessarrayContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variableaccessarray);
		try {
			setState(232);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(230);
				variable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(231);
				accessarray();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class VariableContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(TLONParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(TLONParser.ID, i);
		}
		public List<TerminalNode> POINT() { return getTokens(TLONParser.POINT); }
		public TerminalNode POINT(int i) {
			return getToken(TLONParser.POINT, i);
		}
		public TerminalNode OPAR() { return getToken(TLONParser.OPAR, 0); }
		public TerminalNode CPAR() { return getToken(TLONParser.CPAR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TLONParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TLONParser.COMMA, i);
		}
		public TerminalNode OKEY() { return getToken(TLONParser.OKEY, 0); }
		public TerminalNode CKEY() { return getToken(TLONParser.CKEY, 0); }
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitVariable(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_variable);
		int _la;
		try {
			int _alt;
			setState(268);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(234);
				match(ID);
				setState(239);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(235);
						match(POINT);
						setState(236);
						match(ID);
						}
						} 
					}
					setState(241);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,24,_ctx);
				}
				setState(254);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,27,_ctx) ) {
				case 1:
					{
					setState(242);
					match(OPAR);
					setState(251);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MINUS) | (1L << NOT) | (1L << OPAR) | (1L << OBRACE) | (1L << OKEY) | (1L << TRUE) | (1L << FALSE) | (1L << NIL) | (1L << ID) | (1L << INT) | (1L << FLOAT) | (1L << STRING))) != 0)) {
						{
						setState(243);
						expr(0);
						setState(248);
						_errHandler.sync(this);
						_la = _input.LA(1);
						while (_la==COMMA) {
							{
							{
							setState(244);
							match(COMMA);
							setState(245);
							expr(0);
							}
							}
							setState(250);
							_errHandler.sync(this);
							_la = _input.LA(1);
						}
						}
					}

					setState(253);
					match(CPAR);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(256);
				match(ID);
				setState(261);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==POINT) {
					{
					{
					setState(257);
					match(POINT);
					setState(258);
					match(ID);
					}
					}
					setState(263);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(264);
				match(OKEY);
				setState(265);
				expr(0);
				setState(266);
				match(CKEY);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ParametroContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TLONParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(TLONParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ParametroContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parametro; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterParametro(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitParametro(this);
		}
	}

	public final ParametroContext parametro() throws RecognitionException {
		ParametroContext _localctx = new ParametroContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_parametro);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(270);
			match(ID);
			setState(273);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASSIGN) {
				{
				setState(271);
				match(ASSIGN);
				setState(272);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ParExprContext extends ExprContext {
		public TerminalNode OPAR() { return getToken(TLONParser.OPAR, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode CPAR() { return getToken(TLONParser.CPAR, 0); }
		public ParExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterParExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitParExpr(this);
		}
	}
	public static class NotExprContext extends ExprContext {
		public TerminalNode NOT() { return getToken(TLONParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public NotExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterNotExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitNotExpr(this);
		}
	}
	public static class UnaryMinusExprContext extends ExprContext {
		public TerminalNode MINUS() { return getToken(TLONParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public UnaryMinusExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterUnaryMinusExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitUnaryMinusExpr(this);
		}
	}
	public static class MultiplicationExprContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode MULT() { return getToken(TLONParser.MULT, 0); }
		public TerminalNode DIV() { return getToken(TLONParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(TLONParser.MOD, 0); }
		public MultiplicationExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterMultiplicationExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitMultiplicationExpr(this);
		}
	}
	public static class AtomExprContext extends ExprContext {
		public AtomContext atom() {
			return getRuleContext(AtomContext.class,0);
		}
		public AtomExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterAtomExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitAtomExpr(this);
		}
	}
	public static class OrExprContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode OR() { return getToken(TLONParser.OR, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterOrExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitOrExpr(this);
		}
	}
	public static class AdditiveExprContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(TLONParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(TLONParser.MINUS, 0); }
		public AdditiveExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterAdditiveExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitAdditiveExpr(this);
		}
	}
	public static class PowExprContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode POW() { return getToken(TLONParser.POW, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public PowExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterPowExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitPowExpr(this);
		}
	}
	public static class RelationalExprContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode LTEQ() { return getToken(TLONParser.LTEQ, 0); }
		public TerminalNode GTEQ() { return getToken(TLONParser.GTEQ, 0); }
		public TerminalNode LT() { return getToken(TLONParser.LT, 0); }
		public TerminalNode GT() { return getToken(TLONParser.GT, 0); }
		public RelationalExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterRelationalExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitRelationalExpr(this);
		}
	}
	public static class EqualityExprContext extends ExprContext {
		public ExprContext left;
		public Token op;
		public ExprContext right;
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode EQ() { return getToken(TLONParser.EQ, 0); }
		public TerminalNode NEQ() { return getToken(TLONParser.NEQ, 0); }
		public EqualityExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterEqualityExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitEqualityExpr(this);
		}
	}
	public static class AndExprContext extends ExprContext {
		public ExprContext left;
		public ExprContext right;
		public TerminalNode AND() { return getToken(TLONParser.AND, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndExprContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterAndExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitAndExpr(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 46;
		enterRecursionRule(_localctx, 46, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MINUS:
				{
				_localctx = new UnaryMinusExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(276);
				match(MINUS);
				setState(277);
				expr(10);
				}
				break;
			case NOT:
				{
				_localctx = new NotExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(278);
				match(NOT);
				setState(279);
				expr(9);
				}
				break;
			case OPAR:
				{
				_localctx = new ParExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(280);
				match(OPAR);
				setState(281);
				expr(0);
				setState(282);
				match(CPAR);
				}
				break;
			case OBRACE:
			case OKEY:
			case TRUE:
			case FALSE:
			case NIL:
			case ID:
			case INT:
			case FLOAT:
			case STRING:
				{
				_localctx = new AtomExprContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(284);
				atom();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(310);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(308);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
					case 1:
						{
						_localctx = new PowExprContext(new ExprContext(_parentctx, _parentState));
						((PowExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(287);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(288);
						match(POW);
						setState(289);
						((PowExprContext)_localctx).right = expr(11);
						}
						break;
					case 2:
						{
						_localctx = new MultiplicationExprContext(new ExprContext(_parentctx, _parentState));
						((MultiplicationExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(290);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(291);
						((MultiplicationExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << MULT) | (1L << DIV) | (1L << MOD))) != 0)) ) {
							((MultiplicationExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(292);
						((MultiplicationExprContext)_localctx).right = expr(9);
						}
						break;
					case 3:
						{
						_localctx = new AdditiveExprContext(new ExprContext(_parentctx, _parentState));
						((AdditiveExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(293);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(294);
						((AdditiveExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
							((AdditiveExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(295);
						((AdditiveExprContext)_localctx).right = expr(8);
						}
						break;
					case 4:
						{
						_localctx = new RelationalExprContext(new ExprContext(_parentctx, _parentState));
						((RelationalExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(296);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(297);
						((RelationalExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << GT) | (1L << LT) | (1L << GTEQ) | (1L << LTEQ))) != 0)) ) {
							((RelationalExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(298);
						((RelationalExprContext)_localctx).right = expr(7);
						}
						break;
					case 5:
						{
						_localctx = new EqualityExprContext(new ExprContext(_parentctx, _parentState));
						((EqualityExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(299);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(300);
						((EqualityExprContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==EQ || _la==NEQ) ) {
							((EqualityExprContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(301);
						((EqualityExprContext)_localctx).right = expr(6);
						}
						break;
					case 6:
						{
						_localctx = new AndExprContext(new ExprContext(_parentctx, _parentState));
						((AndExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(302);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(303);
						match(AND);
						setState(304);
						((AndExprContext)_localctx).right = expr(5);
						}
						break;
					case 7:
						{
						_localctx = new OrExprContext(new ExprContext(_parentctx, _parentState));
						((OrExprContext)_localctx).left = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(305);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(306);
						match(OR);
						setState(307);
						((OrExprContext)_localctx).right = expr(4);
						}
						break;
					}
					} 
				}
				setState(312);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,33,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class AtomContext extends ParserRuleContext {
		public AtomContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_atom; }
	 
		public AtomContext() { }
		public void copyFrom(AtomContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ObjetoAtomContext extends AtomContext {
		public ObjetoContext objeto() {
			return getRuleContext(ObjetoContext.class,0);
		}
		public ObjetoAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterObjetoAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitObjetoAtom(this);
		}
	}
	public static class AccessToarrayContext extends AtomContext {
		public AccessarrayContext accessarray() {
			return getRuleContext(AccessarrayContext.class,0);
		}
		public AccessToarrayContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterAccessToarray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitAccessToarray(this);
		}
	}
	public static class BooleanAtomContext extends AtomContext {
		public TerminalNode TRUE() { return getToken(TLONParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(TLONParser.FALSE, 0); }
		public BooleanAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterBooleanAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitBooleanAtom(this);
		}
	}
	public static class ArrayAtomContext extends AtomContext {
		public ArrayContext array() {
			return getRuleContext(ArrayContext.class,0);
		}
		public ArrayAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterArrayAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitArrayAtom(this);
		}
	}
	public static class AccessObjectContext extends AtomContext {
		public AccesstoobjectContext accesstoobject() {
			return getRuleContext(AccesstoobjectContext.class,0);
		}
		public AccessObjectContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterAccessObject(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitAccessObject(this);
		}
	}
	public static class StringAtomContext extends AtomContext {
		public TerminalNode STRING() { return getToken(TLONParser.STRING, 0); }
		public StringAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterStringAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitStringAtom(this);
		}
	}
	public static class NilAtomContext extends AtomContext {
		public TerminalNode NIL() { return getToken(TLONParser.NIL, 0); }
		public NilAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterNilAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitNilAtom(this);
		}
	}
	public static class NumberAtomContext extends AtomContext {
		public TerminalNode INT() { return getToken(TLONParser.INT, 0); }
		public TerminalNode FLOAT() { return getToken(TLONParser.FLOAT, 0); }
		public NumberAtomContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterNumberAtom(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitNumberAtom(this);
		}
	}
	public static class AccessVariableContext extends AtomContext {
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public AccessVariableContext(AtomContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterAccessVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitAccessVariable(this);
		}
	}

	public final AtomContext atom() throws RecognitionException {
		AtomContext _localctx = new AtomContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_atom);
		int _la;
		try {
			setState(322);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				_localctx = new NumberAtomContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(313);
				_la = _input.LA(1);
				if ( !(_la==INT || _la==FLOAT) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 2:
				_localctx = new BooleanAtomContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(314);
				_la = _input.LA(1);
				if ( !(_la==TRUE || _la==FALSE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 3:
				_localctx = new StringAtomContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(315);
				match(STRING);
				}
				break;
			case 4:
				_localctx = new ArrayAtomContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(316);
				array();
				}
				break;
			case 5:
				_localctx = new ObjetoAtomContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(317);
				objeto();
				}
				break;
			case 6:
				_localctx = new AccessToarrayContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(318);
				accessarray();
				}
				break;
			case 7:
				_localctx = new AccessObjectContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(319);
				accesstoobject();
				}
				break;
			case 8:
				_localctx = new AccessVariableContext(_localctx);
				enterOuterAlt(_localctx, 8);
				{
				setState(320);
				variable();
				}
				break;
			case 9:
				_localctx = new NilAtomContext(_localctx);
				enterOuterAlt(_localctx, 9);
				{
				setState(321);
				match(NIL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ObjetoContext extends ParserRuleContext {
		public TerminalNode OBRACE() { return getToken(TLONParser.OBRACE, 0); }
		public TerminalNode CBRACE() { return getToken(TLONParser.CBRACE, 0); }
		public List<KeyvalueContext> keyvalue() {
			return getRuleContexts(KeyvalueContext.class);
		}
		public KeyvalueContext keyvalue(int i) {
			return getRuleContext(KeyvalueContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(TLONParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(TLONParser.COMMA, i);
		}
		public ObjetoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_objeto; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterObjeto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitObjeto(this);
		}
	}

	public final ObjetoContext objeto() throws RecognitionException {
		ObjetoContext _localctx = new ObjetoContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_objeto);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(324);
			match(OBRACE);
			setState(333);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(325);
				keyvalue();
				setState(330);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(326);
					match(COMMA);
					setState(327);
					keyvalue();
					}
					}
					setState(332);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(335);
			match(CBRACE);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeyvalueContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(TLONParser.ID, 0); }
		public TerminalNode POINTS() { return getToken(TLONParser.POINTS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public KeyvalueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyvalue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).enterKeyvalue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof TLONListener ) ((TLONListener)listener).exitKeyvalue(this);
		}
	}

	public final KeyvalueContext keyvalue() throws RecognitionException {
		KeyvalueContext _localctx = new KeyvalueContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_keyvalue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(337);
			match(ID);
			setState(338);
			match(POINTS);
			setState(339);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 23:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 8);
		case 2:
			return precpred(_ctx, 7);
		case 3:
			return precpred(_ctx, 6);
		case 4:
			return precpred(_ctx, 5);
		case 5:
			return precpred(_ctx, 4);
		case 6:
			return precpred(_ctx, 3);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\63\u0158\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\5\2;\n\2\3\3\3\3\3\3\3\4\3\4\7"+
		"\4B\n\4\f\4\16\4E\13\4\3\4\3\4\3\5\3\5\5\5K\n\5\3\6\3\6\3\6\3\6\5\6Q\n"+
		"\6\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\5\7\\\n\7\3\b\3\b\3\b\3\b\5\bb"+
		"\n\b\3\t\3\t\3\t\3\t\3\t\7\ti\n\t\f\t\16\tl\13\t\3\t\3\t\5\tp\n\t\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r"+
		"\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\7\16\u008c\n\16\f\16\16\16"+
		"\u008f\13\16\5\16\u0091\n\16\3\16\3\16\3\16\7\16\u0096\n\16\f\16\16\16"+
		"\u0099\13\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\7\17\u00a2\n\17\f\17\16"+
		"\17\u00a5\13\17\3\17\3\17\3\17\3\17\5\17\u00ab\n\17\3\20\3\20\3\20\3\20"+
		"\3\20\3\20\3\21\3\21\5\21\u00b5\n\21\3\21\3\21\3\22\3\22\3\22\7\22\u00bc"+
		"\n\22\f\22\16\22\u00bf\13\22\3\22\3\22\3\22\3\22\5\22\u00c5\n\22\3\23"+
		"\3\23\3\23\3\23\7\23\u00cb\n\23\f\23\16\23\u00ce\13\23\5\23\u00d0\n\23"+
		"\3\23\3\23\3\23\3\23\3\23\3\23\3\23\5\23\u00d9\n\23\3\23\3\23\3\23\5\23"+
		"\u00de\n\23\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\5\26"+
		"\u00eb\n\26\3\27\3\27\3\27\7\27\u00f0\n\27\f\27\16\27\u00f3\13\27\3\27"+
		"\3\27\3\27\3\27\7\27\u00f9\n\27\f\27\16\27\u00fc\13\27\5\27\u00fe\n\27"+
		"\3\27\5\27\u0101\n\27\3\27\3\27\3\27\7\27\u0106\n\27\f\27\16\27\u0109"+
		"\13\27\3\27\3\27\3\27\3\27\5\27\u010f\n\27\3\30\3\30\3\30\5\30\u0114\n"+
		"\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\5\31\u0120\n\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31"+
		"\3\31\3\31\3\31\3\31\3\31\3\31\3\31\7\31\u0137\n\31\f\31\16\31\u013a\13"+
		"\31\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\5\32\u0145\n\32\3\33"+
		"\3\33\3\33\3\33\7\33\u014b\n\33\f\33\16\33\u014e\13\33\5\33\u0150\n\33"+
		"\3\33\3\33\3\34\3\34\3\34\3\34\3\34\2\3\60\35\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\60\62\64\66\2\b\3\2\r\17\3\2\13\f\3\2\7\n\3\2"+
		"\5\6\3\2-.\3\2\33\34\2\u0176\2:\3\2\2\2\4<\3\2\2\2\6C\3\2\2\2\bJ\3\2\2"+
		"\2\nP\3\2\2\2\f[\3\2\2\2\16]\3\2\2\2\20c\3\2\2\2\22q\3\2\2\2\24u\3\2\2"+
		"\2\26{\3\2\2\2\30\u0080\3\2\2\2\32\u0085\3\2\2\2\34\u00aa\3\2\2\2\36\u00ac"+
		"\3\2\2\2 \u00b2\3\2\2\2\"\u00c4\3\2\2\2$\u00dd\3\2\2\2&\u00df\3\2\2\2"+
		"(\u00e4\3\2\2\2*\u00ea\3\2\2\2,\u010e\3\2\2\2.\u0110\3\2\2\2\60\u011f"+
		"\3\2\2\2\62\u0144\3\2\2\2\64\u0146\3\2\2\2\66\u0153\3\2\2\28;\5\4\3\2"+
		"9;\5\6\4\2:8\3\2\2\2:9\3\2\2\2;\3\3\2\2\2<=\5\b\5\2=>\7\62\2\2>\5\3\2"+
		"\2\2?B\5\b\5\2@B\7\62\2\2A?\3\2\2\2A@\3\2\2\2BE\3\2\2\2CA\3\2\2\2CD\3"+
		"\2\2\2DF\3\2\2\2EC\3\2\2\2FG\7\2\2\3G\7\3\2\2\2HK\5\f\7\2IK\5\n\6\2JH"+
		"\3\2\2\2JI\3\2\2\2K\t\3\2\2\2LQ\5\20\t\2MQ\5\22\n\2NQ\5\24\13\2OQ\5\32"+
		"\16\2PL\3\2\2\2PM\3\2\2\2PN\3\2\2\2PO\3\2\2\2Q\13\3\2\2\2R\\\5\16\b\2"+
		"S\\\5\26\f\2T\\\5\30\r\2U\\\5\34\17\2VW\5\62\32\2WX\7\62\2\2X\\\3\2\2"+
		"\2Y\\\5\60\31\2Z\\\7\63\2\2[R\3\2\2\2[S\3\2\2\2[T\3\2\2\2[U\3\2\2\2[V"+
		"\3\2\2\2[Y\3\2\2\2[Z\3\2\2\2\\\r\3\2\2\2]^\5,\27\2^a\7\22\2\2_b\5\16\b"+
		"\2`b\5\60\31\2a_\3\2\2\2a`\3\2\2\2b\17\3\2\2\2cd\7\36\2\2dj\5 \21\2ef"+
		"\7\37\2\2fg\7\36\2\2gi\5 \21\2he\3\2\2\2il\3\2\2\2jh\3\2\2\2jk\3\2\2\2"+
		"ko\3\2\2\2lj\3\2\2\2mn\7\37\2\2np\5\"\22\2om\3\2\2\2op\3\2\2\2p\21\3\2"+
		"\2\2qr\7 \2\2rs\5\60\31\2st\5\"\22\2t\23\3\2\2\2uv\7#\2\2vw\7,\2\2wx\7"+
		"$\2\2xy\5\60\31\2yz\5\"\22\2z\25\3\2\2\2{|\7!\2\2|}\7\23\2\2}~\5\60\31"+
		"\2~\177\7\24\2\2\177\27\3\2\2\2\u0080\u0081\7\"\2\2\u0081\u0082\7\23\2"+
		"\2\u0082\u0083\5\60\31\2\u0083\u0084\7\24\2\2\u0084\31\3\2\2\2\u0085\u0086"+
		"\7%\2\2\u0086\u0087\7,\2\2\u0087\u0090\7\23\2\2\u0088\u008d\5.\30\2\u0089"+
		"\u008a\7\31\2\2\u008a\u008c\5.\30\2\u008b\u0089\3\2\2\2\u008c\u008f\3"+
		"\2\2\2\u008d\u008b\3\2\2\2\u008d\u008e\3\2\2\2\u008e\u0091\3\2\2\2\u008f"+
		"\u008d\3\2\2\2\u0090\u0088\3\2\2\2\u0090\u0091\3\2\2\2\u0091\u0092\3\2"+
		"\2\2\u0092\u0097\7\24\2\2\u0093\u0096\7\62\2\2\u0094\u0096\5\b\5\2\u0095"+
		"\u0093\3\2\2\2\u0095\u0094\3\2\2\2\u0096\u0099\3\2\2\2\u0097\u0095\3\2"+
		"\2\2\u0097\u0098\3\2\2\2\u0098\u009a\3\2\2\2\u0099\u0097\3\2\2\2\u009a"+
		"\u009b\5\36\20\2\u009b\u009c\7&\2\2\u009c\33\3\2\2\2\u009d\u009e\7(\2"+
		"\2\u009e\u00a3\7,\2\2\u009f\u00a0\7+\2\2\u00a0\u00a2\7,\2\2\u00a1\u009f"+
		"\3\2\2\2\u00a2\u00a5\3\2\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a4\3\2\2\2\u00a4"+
		"\u00ab\3\2\2\2\u00a5\u00a3\3\2\2\2\u00a6\u00a7\7)\2\2\u00a7\u00a8\7,\2"+
		"\2\u00a8\u00a9\7(\2\2\u00a9\u00ab\7,\2\2\u00aa\u009d\3\2\2\2\u00aa\u00a6"+
		"\3\2\2\2\u00ab\35\3\2\2\2\u00ac\u00ad\7\'\2\2\u00ad\u00ae\7\23\2\2\u00ae"+
		"\u00af\5\60\31\2\u00af\u00b0\7\24\2\2\u00b0\u00b1\7\62\2\2\u00b1\37\3"+
		"\2\2\2\u00b2\u00b4\5\60\31\2\u00b3\u00b5\7\62\2\2\u00b4\u00b3\3\2\2\2"+
		"\u00b4\u00b5\3\2\2\2\u00b5\u00b6\3\2\2\2\u00b6\u00b7\5\"\22\2\u00b7!\3"+
		"\2\2\2\u00b8\u00bd\7\25\2\2\u00b9\u00bc\5\b\5\2\u00ba\u00bc\7\62\2\2\u00bb"+
		"\u00b9\3\2\2\2\u00bb\u00ba\3\2\2\2\u00bc\u00bf\3\2\2\2\u00bd\u00bb\3\2"+
		"\2\2\u00bd\u00be\3\2\2\2\u00be\u00c0\3\2\2\2\u00bf\u00bd\3\2\2\2\u00c0"+
		"\u00c5\7\26\2\2\u00c1\u00c2\5\b\5\2\u00c2\u00c3\7\62\2\2\u00c3\u00c5\3"+
		"\2\2\2\u00c4\u00b8\3\2\2\2\u00c4\u00c1\3\2\2\2\u00c5#\3\2\2\2\u00c6\u00cf"+
		"\7\27\2\2\u00c7\u00cc\5\60\31\2\u00c8\u00c9\7\31\2\2\u00c9\u00cb\5\60"+
		"\31\2\u00ca\u00c8\3\2\2\2\u00cb\u00ce\3\2\2\2\u00cc\u00ca\3\2\2\2\u00cc"+
		"\u00cd\3\2\2\2\u00cd\u00d0\3\2\2\2\u00ce\u00cc\3\2\2\2\u00cf\u00c7\3\2"+
		"\2\2\u00cf\u00d0\3\2\2\2\u00d0\u00d1\3\2\2\2\u00d1\u00de\7\30\2\2\u00d2"+
		"\u00d3\7\27\2\2\u00d3\u00d4\5\60\31\2\u00d4\u00d8\7\32\2\2\u00d5\u00d6"+
		"\5\60\31\2\u00d6\u00d7\7\32\2\2\u00d7\u00d9\3\2\2\2\u00d8\u00d5\3\2\2"+
		"\2\u00d8\u00d9\3\2\2\2\u00d9\u00da\3\2\2\2\u00da\u00db\5\60\31\2\u00db"+
		"\u00dc\7\30\2\2\u00dc\u00de\3\2\2\2\u00dd\u00c6\3\2\2\2\u00dd\u00d2\3"+
		"\2\2\2\u00de%\3\2\2\2\u00df\u00e0\5,\27\2\u00e0\u00e1\7\27\2\2\u00e1\u00e2"+
		"\5\60\31\2\u00e2\u00e3\7\30\2\2\u00e3\'\3\2\2\2\u00e4\u00e5\5,\27\2\u00e5"+
		"\u00e6\7+\2\2\u00e6\u00e7\5*\26\2\u00e7)\3\2\2\2\u00e8\u00eb\5,\27\2\u00e9"+
		"\u00eb\5&\24\2\u00ea\u00e8\3\2\2\2\u00ea\u00e9\3\2\2\2\u00eb+\3\2\2\2"+
		"\u00ec\u00f1\7,\2\2\u00ed\u00ee\7+\2\2\u00ee\u00f0\7,\2\2\u00ef\u00ed"+
		"\3\2\2\2\u00f0\u00f3\3\2\2\2\u00f1\u00ef\3\2\2\2\u00f1\u00f2\3\2\2\2\u00f2"+
		"\u0100\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f4\u00fd\7\23\2\2\u00f5\u00fa\5"+
		"\60\31\2\u00f6\u00f7\7\31\2\2\u00f7\u00f9\5\60\31\2\u00f8\u00f6\3\2\2"+
		"\2\u00f9\u00fc\3\2\2\2\u00fa\u00f8\3\2\2\2\u00fa\u00fb\3\2\2\2\u00fb\u00fe"+
		"\3\2\2\2\u00fc\u00fa\3\2\2\2\u00fd\u00f5\3\2\2\2\u00fd\u00fe\3\2\2\2\u00fe"+
		"\u00ff\3\2\2\2\u00ff\u0101\7\24\2\2\u0100\u00f4\3\2\2\2\u0100\u0101\3"+
		"\2\2\2\u0101\u010f\3\2\2\2\u0102\u0107\7,\2\2\u0103\u0104\7+\2\2\u0104"+
		"\u0106\7,\2\2\u0105\u0103\3\2\2\2\u0106\u0109\3\2\2\2\u0107\u0105\3\2"+
		"\2\2\u0107\u0108\3\2\2\2\u0108\u010a\3\2\2\2\u0109\u0107\3\2\2\2\u010a"+
		"\u010b\7\27\2\2\u010b\u010c\5\60\31\2\u010c\u010d\7\30\2\2\u010d\u010f"+
		"\3\2\2\2\u010e\u00ec\3\2\2\2\u010e\u0102\3\2\2\2\u010f-\3\2\2\2\u0110"+
		"\u0113\7,\2\2\u0111\u0112\7\22\2\2\u0112\u0114\5\60\31\2\u0113\u0111\3"+
		"\2\2\2\u0113\u0114\3\2\2\2\u0114/\3\2\2\2\u0115\u0116\b\31\1\2\u0116\u0117"+
		"\7\f\2\2\u0117\u0120\5\60\31\f\u0118\u0119\7\21\2\2\u0119\u0120\5\60\31"+
		"\13\u011a\u011b\7\23\2\2\u011b\u011c\5\60\31\2\u011c\u011d\7\24\2\2\u011d"+
		"\u0120\3\2\2\2\u011e\u0120\5\62\32\2\u011f\u0115\3\2\2\2\u011f\u0118\3"+
		"\2\2\2\u011f\u011a\3\2\2\2\u011f\u011e\3\2\2\2\u0120\u0138\3\2\2\2\u0121"+
		"\u0122\f\r\2\2\u0122\u0123\7\20\2\2\u0123\u0137\5\60\31\r\u0124\u0125"+
		"\f\n\2\2\u0125\u0126\t\2\2\2\u0126\u0137\5\60\31\13\u0127\u0128\f\t\2"+
		"\2\u0128\u0129\t\3\2\2\u0129\u0137\5\60\31\n\u012a\u012b\f\b\2\2\u012b"+
		"\u012c\t\4\2\2\u012c\u0137\5\60\31\t\u012d\u012e\f\7\2\2\u012e\u012f\t"+
		"\5\2\2\u012f\u0137\5\60\31\b\u0130\u0131\f\6\2\2\u0131\u0132\7\4\2\2\u0132"+
		"\u0137\5\60\31\7\u0133\u0134\f\5\2\2\u0134\u0135\7\3\2\2\u0135\u0137\5"+
		"\60\31\6\u0136\u0121\3\2\2\2\u0136\u0124\3\2\2\2\u0136\u0127\3\2\2\2\u0136"+
		"\u012a\3\2\2\2\u0136\u012d\3\2\2\2\u0136\u0130\3\2\2\2\u0136\u0133\3\2"+
		"\2\2\u0137\u013a\3\2\2\2\u0138\u0136\3\2\2\2\u0138\u0139\3\2\2\2\u0139"+
		"\61\3\2\2\2\u013a\u0138\3\2\2\2\u013b\u0145\t\6\2\2\u013c\u0145\t\7\2"+
		"\2\u013d\u0145\7/\2\2\u013e\u0145\5$\23\2\u013f\u0145\5\64\33\2\u0140"+
		"\u0145\5&\24\2\u0141\u0145\5(\25\2\u0142\u0145\5,\27\2\u0143\u0145\7\35"+
		"\2\2\u0144\u013b\3\2\2\2\u0144\u013c\3\2\2\2\u0144\u013d\3\2\2\2\u0144"+
		"\u013e\3\2\2\2\u0144\u013f\3\2\2\2\u0144\u0140\3\2\2\2\u0144\u0141\3\2"+
		"\2\2\u0144\u0142\3\2\2\2\u0144\u0143\3\2\2\2\u0145\63\3\2\2\2\u0146\u014f"+
		"\7\25\2\2\u0147\u014c\5\66\34\2\u0148\u0149\7\31\2\2\u0149\u014b\5\66"+
		"\34\2\u014a\u0148\3\2\2\2\u014b\u014e\3\2\2\2\u014c\u014a\3\2\2\2\u014c"+
		"\u014d\3\2\2\2\u014d\u0150\3\2\2\2\u014e\u014c\3\2\2\2\u014f\u0147\3\2"+
		"\2\2\u014f\u0150\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0152\7\26\2\2\u0152"+
		"\65\3\2\2\2\u0153\u0154\7,\2\2\u0154\u0155\7\32\2\2\u0155\u0156\5\60\31"+
		"\2\u0156\67\3\2\2\2\':ACJP[ajo\u008d\u0090\u0095\u0097\u00a3\u00aa\u00b4"+
		"\u00bb\u00bd\u00c4\u00cc\u00cf\u00d8\u00dd\u00ea\u00f1\u00fa\u00fd\u0100"+
		"\u0107\u010e\u0113\u011f\u0136\u0138\u0144\u014c\u014f";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}