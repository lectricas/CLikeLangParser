// Generated from /Users/aleksei/IdeaProjects/SimpleCLikeParser/src/main/java/clike/CLikeLang.g4 by ANTLR 4.10.1
package clike;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class CLikeLangParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.10.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, NAME=24, INT=25, 
		WS=26;
	public static final int
		RULE_start = 0, RULE_stat = 1, RULE_exp = 2, RULE_arithExp = 3, RULE_boolExp = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"start", "stat", "exp", "arithExp", "boolExp"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'='", "'while'", "'('", "')'", "'{'", "'}'", "'if'", "'then'", 
			"'else'", "'^'", "'-'", "'*'", "'/'", "'+'", "'<'", "'>'", "'<='", "'>='", 
			"'!='", "'=='", "'!'", "'&&'", "'||'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"NAME", "INT", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
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
	public String getGrammarFileName() { return "CLikeLang.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public CLikeLangParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class StartContext extends ParserRuleContext {
		public StatContext stat() {
			return getRuleContext(StatContext.class,0);
		}
		public TerminalNode EOF() { return getToken(CLikeLangParser.EOF, 0); }
		public StartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_start; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLikeLangListener ) ((CLikeLangListener)listener).enterStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLikeLangListener ) ((CLikeLangListener)listener).exitStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLikeLangVisitor ) return ((CLikeLangVisitor<? extends T>)visitor).visitStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StartContext start() throws RecognitionException {
		StartContext _localctx = new StartContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_start);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(10);
			stat();
			setState(11);
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
		public StatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stat; }
	 
		public StatContext() { }
		public void copyFrom(StatContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class ExpressionContext extends StatContext {
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public ExpressionContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLikeLangListener ) ((CLikeLangListener)listener).enterExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLikeLangListener ) ((CLikeLangListener)listener).exitExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLikeLangVisitor ) return ((CLikeLangVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class WhileContext extends StatContext {
		public ExpContext cond;
		public StatContext block;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public WhileContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLikeLangListener ) ((CLikeLangListener)listener).enterWhile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLikeLangListener ) ((CLikeLangListener)listener).exitWhile(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLikeLangVisitor ) return ((CLikeLangVisitor<? extends T>)visitor).visitWhile(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class IfContext extends StatContext {
		public ExpContext cond;
		public StatContext ifBlock;
		public StatContext elseBlock;
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public List<StatContext> stat() {
			return getRuleContexts(StatContext.class);
		}
		public StatContext stat(int i) {
			return getRuleContext(StatContext.class,i);
		}
		public IfContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLikeLangListener ) ((CLikeLangListener)listener).enterIf(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLikeLangListener ) ((CLikeLangListener)listener).exitIf(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLikeLangVisitor ) return ((CLikeLangVisitor<? extends T>)visitor).visitIf(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AssignContext extends StatContext {
		public TerminalNode NAME() { return getToken(CLikeLangParser.NAME, 0); }
		public ExpContext exp() {
			return getRuleContext(ExpContext.class,0);
		}
		public AssignContext(StatContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLikeLangListener ) ((CLikeLangListener)listener).enterAssign(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLikeLangListener ) ((CLikeLangListener)listener).exitAssign(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLikeLangVisitor ) return ((CLikeLangVisitor<? extends T>)visitor).visitAssign(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StatContext stat() throws RecognitionException {
		StatContext _localctx = new StatContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_stat);
		int _la;
		try {
			setState(54);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,4,_ctx) ) {
			case 1:
				_localctx = new AssignContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(13);
				match(NAME);
				setState(14);
				match(T__0);
				setState(15);
				exp();
				}
				break;
			case 2:
				_localctx = new WhileContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(16);
				match(T__1);
				setState(17);
				match(T__2);
				setState(18);
				((WhileContext)_localctx).cond = exp();
				setState(19);
				match(T__3);
				setState(20);
				match(T__4);
				setState(24);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__6) | (1L << T__10) | (1L << T__20) | (1L << NAME) | (1L << INT))) != 0)) {
					{
					{
					setState(21);
					((WhileContext)_localctx).block = stat();
					}
					}
					setState(26);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(27);
				match(T__5);
				}
				break;
			case 3:
				_localctx = new IfContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(29);
				match(T__6);
				setState(30);
				match(T__2);
				setState(31);
				((IfContext)_localctx).cond = exp();
				setState(32);
				match(T__3);
				setState(33);
				match(T__7);
				setState(34);
				match(T__4);
				setState(38);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__6) | (1L << T__10) | (1L << T__20) | (1L << NAME) | (1L << INT))) != 0)) {
					{
					{
					setState(35);
					((IfContext)_localctx).ifBlock = stat();
					}
					}
					setState(40);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(41);
				match(T__5);
				setState(51);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__8) {
					{
					setState(42);
					match(T__8);
					setState(43);
					match(T__4);
					setState(47);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__1) | (1L << T__2) | (1L << T__6) | (1L << T__10) | (1L << T__20) | (1L << NAME) | (1L << INT))) != 0)) {
						{
						{
						setState(44);
						((IfContext)_localctx).elseBlock = stat();
						}
						}
						setState(49);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					setState(50);
					match(T__5);
					}
				}

				}
				break;
			case 4:
				_localctx = new ExpressionContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(53);
				exp();
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

	public static class ExpContext extends ParserRuleContext {
		public ArithExpContext arithExp() {
			return getRuleContext(ArithExpContext.class,0);
		}
		public BoolExpContext boolExp() {
			return getRuleContext(BoolExpContext.class,0);
		}
		public ExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_exp; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLikeLangListener ) ((CLikeLangListener)listener).enterExp(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLikeLangListener ) ((CLikeLangListener)listener).exitExp(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLikeLangVisitor ) return ((CLikeLangVisitor<? extends T>)visitor).visitExp(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpContext exp() throws RecognitionException {
		ExpContext _localctx = new ExpContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_exp);
		try {
			setState(58);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(56);
				arithExp(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(57);
				boolExp(0);
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

	public static class ArithExpContext extends ParserRuleContext {
		public ArithExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_arithExp; }
	 
		public ArithExpContext() { }
		public void copyFrom(ArithExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class MyStringContext extends ArithExpContext {
		public TerminalNode NAME() { return getToken(CLikeLangParser.NAME, 0); }
		public MyStringContext(ArithExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLikeLangListener ) ((CLikeLangListener)listener).enterMyString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLikeLangListener ) ((CLikeLangListener)listener).exitMyString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLikeLangVisitor ) return ((CLikeLangVisitor<? extends T>)visitor).visitMyString(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class AddSubContext extends ArithExpContext {
		public ArithExpContext l;
		public Token op;
		public ArithExpContext r;
		public List<ArithExpContext> arithExp() {
			return getRuleContexts(ArithExpContext.class);
		}
		public ArithExpContext arithExp(int i) {
			return getRuleContext(ArithExpContext.class,i);
		}
		public AddSubContext(ArithExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLikeLangListener ) ((CLikeLangListener)listener).enterAddSub(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLikeLangListener ) ((CLikeLangListener)listener).exitAddSub(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLikeLangVisitor ) return ((CLikeLangVisitor<? extends T>)visitor).visitAddSub(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryIntContext extends ArithExpContext {
		public Token op;
		public ArithExpContext arithExp() {
			return getRuleContext(ArithExpContext.class,0);
		}
		public UnaryIntContext(ArithExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLikeLangListener ) ((CLikeLangListener)listener).enterUnaryInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLikeLangListener ) ((CLikeLangListener)listener).exitUnaryInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLikeLangVisitor ) return ((CLikeLangVisitor<? extends T>)visitor).visitUnaryInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MyIntContext extends ArithExpContext {
		public TerminalNode INT() { return getToken(CLikeLangParser.INT, 0); }
		public MyIntContext(ArithExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLikeLangListener ) ((CLikeLangListener)listener).enterMyInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLikeLangListener ) ((CLikeLangListener)listener).exitMyInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLikeLangVisitor ) return ((CLikeLangVisitor<? extends T>)visitor).visitMyInt(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class PowerContext extends ArithExpContext {
		public ArithExpContext l;
		public Token op;
		public ArithExpContext r;
		public List<ArithExpContext> arithExp() {
			return getRuleContexts(ArithExpContext.class);
		}
		public ArithExpContext arithExp(int i) {
			return getRuleContext(ArithExpContext.class,i);
		}
		public PowerContext(ArithExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLikeLangListener ) ((CLikeLangListener)listener).enterPower(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLikeLangListener ) ((CLikeLangListener)listener).exitPower(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLikeLangVisitor ) return ((CLikeLangVisitor<? extends T>)visitor).visitPower(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class BracketsArithContext extends ArithExpContext {
		public ArithExpContext arithExp() {
			return getRuleContext(ArithExpContext.class,0);
		}
		public BracketsArithContext(ArithExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLikeLangListener ) ((CLikeLangListener)listener).enterBracketsArith(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLikeLangListener ) ((CLikeLangListener)listener).exitBracketsArith(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLikeLangVisitor ) return ((CLikeLangVisitor<? extends T>)visitor).visitBracketsArith(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class MulDivContext extends ArithExpContext {
		public ArithExpContext l;
		public Token op;
		public ArithExpContext r;
		public List<ArithExpContext> arithExp() {
			return getRuleContexts(ArithExpContext.class);
		}
		public ArithExpContext arithExp(int i) {
			return getRuleContext(ArithExpContext.class,i);
		}
		public MulDivContext(ArithExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLikeLangListener ) ((CLikeLangListener)listener).enterMulDiv(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLikeLangListener ) ((CLikeLangListener)listener).exitMulDiv(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLikeLangVisitor ) return ((CLikeLangVisitor<? extends T>)visitor).visitMulDiv(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ArithExpContext arithExp() throws RecognitionException {
		return arithExp(0);
	}

	private ArithExpContext arithExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ArithExpContext _localctx = new ArithExpContext(_ctx, _parentState);
		ArithExpContext _prevctx = _localctx;
		int _startState = 6;
		enterRecursionRule(_localctx, 6, RULE_arithExp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(69);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__10:
				{
				_localctx = new UnaryIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(61);
				((UnaryIntContext)_localctx).op = match(T__10);
				setState(62);
				arithExp(6);
				}
				break;
			case T__2:
				{
				_localctx = new BracketsArithContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(63);
				match(T__2);
				setState(64);
				arithExp(0);
				setState(65);
				match(T__3);
				}
				break;
			case INT:
				{
				_localctx = new MyIntContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(67);
				match(INT);
				}
				break;
			case NAME:
				{
				_localctx = new MyStringContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(68);
				match(NAME);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(82);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(80);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,7,_ctx) ) {
					case 1:
						{
						_localctx = new PowerContext(new ArithExpContext(_parentctx, _parentState));
						((PowerContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithExp);
						setState(71);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(72);
						((PowerContext)_localctx).op = match(T__9);
						setState(73);
						((PowerContext)_localctx).r = arithExp(7);
						}
						break;
					case 2:
						{
						_localctx = new MulDivContext(new ArithExpContext(_parentctx, _parentState));
						((MulDivContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithExp);
						setState(74);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(75);
						((MulDivContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__11 || _la==T__12) ) {
							((MulDivContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(76);
						((MulDivContext)_localctx).r = arithExp(6);
						}
						break;
					case 3:
						{
						_localctx = new AddSubContext(new ArithExpContext(_parentctx, _parentState));
						((AddSubContext)_localctx).l = _prevctx;
						pushNewRecursionContext(_localctx, _startState, RULE_arithExp);
						setState(77);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(78);
						((AddSubContext)_localctx).op = _input.LT(1);
						_la = _input.LA(1);
						if ( !(_la==T__10 || _la==T__13) ) {
							((AddSubContext)_localctx).op = (Token)_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(79);
						((AddSubContext)_localctx).r = arithExp(5);
						}
						break;
					}
					} 
				}
				setState(84);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,8,_ctx);
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

	public static class BoolExpContext extends ParserRuleContext {
		public BoolExpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_boolExp; }
	 
		public BoolExpContext() { }
		public void copyFrom(BoolExpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class AndOrContext extends BoolExpContext {
		public BoolExpContext l;
		public Token op;
		public BoolExpContext r;
		public List<BoolExpContext> boolExp() {
			return getRuleContexts(BoolExpContext.class);
		}
		public BoolExpContext boolExp(int i) {
			return getRuleContext(BoolExpContext.class,i);
		}
		public AndOrContext(BoolExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLikeLangListener ) ((CLikeLangListener)listener).enterAndOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLikeLangListener ) ((CLikeLangListener)listener).exitAndOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLikeLangVisitor ) return ((CLikeLangVisitor<? extends T>)visitor).visitAndOr(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class CompareContext extends BoolExpContext {
		public ArithExpContext l;
		public Token op;
		public ArithExpContext r;
		public List<ArithExpContext> arithExp() {
			return getRuleContexts(ArithExpContext.class);
		}
		public ArithExpContext arithExp(int i) {
			return getRuleContext(ArithExpContext.class,i);
		}
		public CompareContext(BoolExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLikeLangListener ) ((CLikeLangListener)listener).enterCompare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLikeLangListener ) ((CLikeLangListener)listener).exitCompare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLikeLangVisitor ) return ((CLikeLangVisitor<? extends T>)visitor).visitCompare(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class UnaryBoolContext extends BoolExpContext {
		public Token op;
		public BoolExpContext boolExp() {
			return getRuleContext(BoolExpContext.class,0);
		}
		public UnaryBoolContext(BoolExpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof CLikeLangListener ) ((CLikeLangListener)listener).enterUnaryBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof CLikeLangListener ) ((CLikeLangListener)listener).exitUnaryBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof CLikeLangVisitor ) return ((CLikeLangVisitor<? extends T>)visitor).visitUnaryBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BoolExpContext boolExp() throws RecognitionException {
		return boolExp(0);
	}

	private BoolExpContext boolExp(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BoolExpContext _localctx = new BoolExpContext(_ctx, _parentState);
		BoolExpContext _prevctx = _localctx;
		int _startState = 8;
		enterRecursionRule(_localctx, 8, RULE_boolExp, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__2:
			case T__10:
			case NAME:
			case INT:
				{
				_localctx = new CompareContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(86);
				((CompareContext)_localctx).l = arithExp(0);
				setState(87);
				((CompareContext)_localctx).op = _input.LT(1);
				_la = _input.LA(1);
				if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16) | (1L << T__17) | (1L << T__18) | (1L << T__19))) != 0)) ) {
					((CompareContext)_localctx).op = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(88);
				((CompareContext)_localctx).r = arithExp(0);
				}
				break;
			case T__20:
				{
				_localctx = new UnaryBoolContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(90);
				((UnaryBoolContext)_localctx).op = match(T__20);
				setState(91);
				boolExp(2);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			_ctx.stop = _input.LT(-1);
			setState(99);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new AndOrContext(new BoolExpContext(_parentctx, _parentState));
					((AndOrContext)_localctx).l = _prevctx;
					pushNewRecursionContext(_localctx, _startState, RULE_boolExp);
					setState(94);
					if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
					setState(95);
					((AndOrContext)_localctx).op = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==T__21 || _la==T__22) ) {
						((AndOrContext)_localctx).op = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(96);
					((AndOrContext)_localctx).r = boolExp(1);
					}
					} 
				}
				setState(101);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,10,_ctx);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 3:
			return arithExp_sempred((ArithExpContext)_localctx, predIndex);
		case 4:
			return boolExp_sempred((BoolExpContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean arithExp_sempred(ArithExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 7);
		case 1:
			return precpred(_ctx, 5);
		case 2:
			return precpred(_ctx, 4);
		}
		return true;
	}
	private boolean boolExp_sempred(BoolExpContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 1);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u001ag\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0001"+
		"\u0000\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0005"+
		"\u0001\u0017\b\u0001\n\u0001\f\u0001\u001a\t\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0001"+
		"\u0001\u0001\u0005\u0001%\b\u0001\n\u0001\f\u0001(\t\u0001\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0005\u0001.\b\u0001\n\u0001\f\u0001"+
		"1\t\u0001\u0001\u0001\u0003\u00014\b\u0001\u0001\u0001\u0003\u00017\b"+
		"\u0001\u0001\u0002\u0001\u0002\u0003\u0002;\b\u0002\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0003\u0003F\b\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001"+
		"\u0003\u0005\u0003Q\b\u0003\n\u0003\f\u0003T\t\u0003\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0003"+
		"\u0004]\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004b\b\u0004"+
		"\n\u0004\f\u0004e\t\u0004\u0001\u0004\u0000\u0002\u0006\b\u0005\u0000"+
		"\u0002\u0004\u0006\b\u0000\u0004\u0001\u0000\f\r\u0002\u0000\u000b\u000b"+
		"\u000e\u000e\u0001\u0000\u000f\u0014\u0001\u0000\u0016\u0017q\u0000\n"+
		"\u0001\u0000\u0000\u0000\u00026\u0001\u0000\u0000\u0000\u0004:\u0001\u0000"+
		"\u0000\u0000\u0006E\u0001\u0000\u0000\u0000\b\\\u0001\u0000\u0000\u0000"+
		"\n\u000b\u0003\u0002\u0001\u0000\u000b\f\u0005\u0000\u0000\u0001\f\u0001"+
		"\u0001\u0000\u0000\u0000\r\u000e\u0005\u0018\u0000\u0000\u000e\u000f\u0005"+
		"\u0001\u0000\u0000\u000f7\u0003\u0004\u0002\u0000\u0010\u0011\u0005\u0002"+
		"\u0000\u0000\u0011\u0012\u0005\u0003\u0000\u0000\u0012\u0013\u0003\u0004"+
		"\u0002\u0000\u0013\u0014\u0005\u0004\u0000\u0000\u0014\u0018\u0005\u0005"+
		"\u0000\u0000\u0015\u0017\u0003\u0002\u0001\u0000\u0016\u0015\u0001\u0000"+
		"\u0000\u0000\u0017\u001a\u0001\u0000\u0000\u0000\u0018\u0016\u0001\u0000"+
		"\u0000\u0000\u0018\u0019\u0001\u0000\u0000\u0000\u0019\u001b\u0001\u0000"+
		"\u0000\u0000\u001a\u0018\u0001\u0000\u0000\u0000\u001b\u001c\u0005\u0006"+
		"\u0000\u0000\u001c7\u0001\u0000\u0000\u0000\u001d\u001e\u0005\u0007\u0000"+
		"\u0000\u001e\u001f\u0005\u0003\u0000\u0000\u001f \u0003\u0004\u0002\u0000"+
		" !\u0005\u0004\u0000\u0000!\"\u0005\b\u0000\u0000\"&\u0005\u0005\u0000"+
		"\u0000#%\u0003\u0002\u0001\u0000$#\u0001\u0000\u0000\u0000%(\u0001\u0000"+
		"\u0000\u0000&$\u0001\u0000\u0000\u0000&\'\u0001\u0000\u0000\u0000\')\u0001"+
		"\u0000\u0000\u0000(&\u0001\u0000\u0000\u0000)3\u0005\u0006\u0000\u0000"+
		"*+\u0005\t\u0000\u0000+/\u0005\u0005\u0000\u0000,.\u0003\u0002\u0001\u0000"+
		"-,\u0001\u0000\u0000\u0000.1\u0001\u0000\u0000\u0000/-\u0001\u0000\u0000"+
		"\u0000/0\u0001\u0000\u0000\u000002\u0001\u0000\u0000\u00001/\u0001\u0000"+
		"\u0000\u000024\u0005\u0006\u0000\u00003*\u0001\u0000\u0000\u000034\u0001"+
		"\u0000\u0000\u000047\u0001\u0000\u0000\u000057\u0003\u0004\u0002\u0000"+
		"6\r\u0001\u0000\u0000\u00006\u0010\u0001\u0000\u0000\u00006\u001d\u0001"+
		"\u0000\u0000\u000065\u0001\u0000\u0000\u00007\u0003\u0001\u0000\u0000"+
		"\u00008;\u0003\u0006\u0003\u00009;\u0003\b\u0004\u0000:8\u0001\u0000\u0000"+
		"\u0000:9\u0001\u0000\u0000\u0000;\u0005\u0001\u0000\u0000\u0000<=\u0006"+
		"\u0003\uffff\uffff\u0000=>\u0005\u000b\u0000\u0000>F\u0003\u0006\u0003"+
		"\u0006?@\u0005\u0003\u0000\u0000@A\u0003\u0006\u0003\u0000AB\u0005\u0004"+
		"\u0000\u0000BF\u0001\u0000\u0000\u0000CF\u0005\u0019\u0000\u0000DF\u0005"+
		"\u0018\u0000\u0000E<\u0001\u0000\u0000\u0000E?\u0001\u0000\u0000\u0000"+
		"EC\u0001\u0000\u0000\u0000ED\u0001\u0000\u0000\u0000FR\u0001\u0000\u0000"+
		"\u0000GH\n\u0007\u0000\u0000HI\u0005\n\u0000\u0000IQ\u0003\u0006\u0003"+
		"\u0007JK\n\u0005\u0000\u0000KL\u0007\u0000\u0000\u0000LQ\u0003\u0006\u0003"+
		"\u0006MN\n\u0004\u0000\u0000NO\u0007\u0001\u0000\u0000OQ\u0003\u0006\u0003"+
		"\u0005PG\u0001\u0000\u0000\u0000PJ\u0001\u0000\u0000\u0000PM\u0001\u0000"+
		"\u0000\u0000QT\u0001\u0000\u0000\u0000RP\u0001\u0000\u0000\u0000RS\u0001"+
		"\u0000\u0000\u0000S\u0007\u0001\u0000\u0000\u0000TR\u0001\u0000\u0000"+
		"\u0000UV\u0006\u0004\uffff\uffff\u0000VW\u0003\u0006\u0003\u0000WX\u0007"+
		"\u0002\u0000\u0000XY\u0003\u0006\u0003\u0000Y]\u0001\u0000\u0000\u0000"+
		"Z[\u0005\u0015\u0000\u0000[]\u0003\b\u0004\u0002\\U\u0001\u0000\u0000"+
		"\u0000\\Z\u0001\u0000\u0000\u0000]c\u0001\u0000\u0000\u0000^_\n\u0001"+
		"\u0000\u0000_`\u0007\u0003\u0000\u0000`b\u0003\b\u0004\u0001a^\u0001\u0000"+
		"\u0000\u0000be\u0001\u0000\u0000\u0000ca\u0001\u0000\u0000\u0000cd\u0001"+
		"\u0000\u0000\u0000d\t\u0001\u0000\u0000\u0000ec\u0001\u0000\u0000\u0000"+
		"\u000b\u0018&/36:EPR\\c";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}