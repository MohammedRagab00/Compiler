package com.mangooo.compiler;// $ANTLR 3.4 N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g 2025-05-13 00:53:51

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class Project_ASTLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int T__42=42;
    public static final int T__43=43;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int T__50=50;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int T__58=58;
    public static final int T__59=59;
    public static final int T__60=60;
    public static final int T__61=61;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__70=70;
    public static final int T__71=71;
    public static final int T__72=72;
    public static final int T__73=73;
    public static final int T__74=74;
    public static final int T__75=75;
    public static final int T__76=76;
    public static final int T__77=77;
    public static final int T__78=78;
    public static final int T__79=79;
    public static final int T__80=80;
    public static final int T__81=81;
    public static final int T__82=82;
    public static final int T__83=83;
    public static final int T__84=84;
    public static final int T__85=85;
    public static final int T__86=86;
    public static final int T__87=87;
    public static final int T__88=88;
    public static final int T__89=89;
    public static final int ARRAY_INIT=4;
    public static final int BLOCK=5;
    public static final int BREAK=6;
    public static final int CASE_STMT=7;
    public static final int CHAR_LITERAL=8;
    public static final int COMMENT=9;
    public static final int CONTINUE=10;
    public static final int DIV=11;
    public static final int FLOAT_LITERAL=12;
    public static final int FOR_INIT=13;
    public static final int FUNC_DEF=14;
    public static final int GLOBAL_DECLS=15;
    public static final int ID=16;
    public static final int INCLUDES=17;
    public static final int INIT_LIST=18;
    public static final int INT_LITERAL=19;
    public static final int LINE_COMMENT=20;
    public static final int MOD=21;
    public static final int MULT=22;
    public static final int PARAMS=23;
    public static final int PROGRAM=24;
    public static final int STRING_LITERAL=25;
    public static final int STRUCT_DEF=26;
    public static final int STRUCT_MEMBERS=27;
    public static final int StringCharacter=28;
    public static final int VAR_DECL=29;
    public static final int WS=30;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public Project_ASTLexer() {} 
    public Project_ASTLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public Project_ASTLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g"; }

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:7:7: ( '!' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:7:9: '!'
            {
            match('!'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:8:7: ( '!=' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:8:9: '!='
            {
            match("!="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:9:7: ( '#include' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:9:9: '#include'
            {
            match("#include"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:10:7: ( '%=' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:10:9: '%='
            {
            match("%="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:11:7: ( '&&' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:11:9: '&&'
            {
            match("&&"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:12:7: ( '&' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:12:9: '&'
            {
            match('&'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:13:7: ( '(' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:13:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:14:7: ( ')' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:14:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:15:7: ( '*=' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:15:9: '*='
            {
            match("*="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:16:7: ( '+' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:16:9: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:17:7: ( '++' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:17:9: '++'
            {
            match("++"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:18:7: ( '+=' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:18:9: '+='
            {
            match("+="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:19:7: ( ',' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:19:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:20:7: ( '-' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:20:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:21:7: ( '--' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:21:9: '--'
            {
            match("--"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:22:7: ( '-=' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:22:9: '-='
            {
            match("-="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:23:7: ( '->' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:23:9: '->'
            {
            match("->"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:24:7: ( '.' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:24:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:25:7: ( '.h' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:25:9: '.h'
            {
            match(".h"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:26:7: ( '/=' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:26:9: '/='
            {
            match("/="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:27:7: ( ':' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:27:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:28:7: ( ';' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:28:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:29:7: ( '<' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:29:9: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:30:7: ( '<=' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:30:9: '<='
            {
            match("<="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:31:7: ( '=' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:31:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:32:7: ( '==' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:32:9: '=='
            {
            match("=="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:33:7: ( '>' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:33:9: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:34:7: ( '>=' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:34:9: '>='
            {
            match(">="); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:35:7: ( '[' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:35:9: '['
            {
            match('['); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:36:7: ( ']' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:36:9: ']'
            {
            match(']'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:37:7: ( 'case' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:37:9: 'case'
            {
            match("case"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:38:7: ( 'char' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:38:9: 'char'
            {
            match("char"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:39:7: ( 'ctype.h' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:39:9: 'ctype.h'
            {
            match("ctype.h"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:40:7: ( 'default' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:40:9: 'default'
            {
            match("default"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:41:7: ( 'do' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:41:9: 'do'
            {
            match("do"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:42:7: ( 'double' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:42:9: 'double'
            {
            match("double"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:43:7: ( 'else' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:43:9: 'else'
            {
            match("else"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:44:7: ( 'float' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:44:9: 'float'
            {
            match("float"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:45:7: ( 'for' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:45:9: 'for'
            {
            match("for"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:46:7: ( 'if' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:46:9: 'if'
            {
            match("if"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "T__71"
    public final void mT__71() throws RecognitionException {
        try {
            int _type = T__71;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:47:7: ( 'int' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:47:9: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__71"

    // $ANTLR start "T__72"
    public final void mT__72() throws RecognitionException {
        try {
            int _type = T__72;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:48:7: ( 'long' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:48:9: 'long'
            {
            match("long"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__72"

    // $ANTLR start "T__73"
    public final void mT__73() throws RecognitionException {
        try {
            int _type = T__73;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:49:7: ( 'printf' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:49:9: 'printf'
            {
            match("printf"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__73"

    // $ANTLR start "T__74"
    public final void mT__74() throws RecognitionException {
        try {
            int _type = T__74;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:50:7: ( 'return' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:50:9: 'return'
            {
            match("return"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__74"

    // $ANTLR start "T__75"
    public final void mT__75() throws RecognitionException {
        try {
            int _type = T__75;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:51:7: ( 'short' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:51:9: 'short'
            {
            match("short"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__75"

    // $ANTLR start "T__76"
    public final void mT__76() throws RecognitionException {
        try {
            int _type = T__76;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:52:7: ( 'signed' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:52:9: 'signed'
            {
            match("signed"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__76"

    // $ANTLR start "T__77"
    public final void mT__77() throws RecognitionException {
        try {
            int _type = T__77;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:53:7: ( 'stdio.h' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:53:9: 'stdio.h'
            {
            match("stdio.h"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__77"

    // $ANTLR start "T__78"
    public final void mT__78() throws RecognitionException {
        try {
            int _type = T__78;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:54:7: ( 'stdlib.h' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:54:9: 'stdlib.h'
            {
            match("stdlib.h"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__78"

    // $ANTLR start "T__79"
    public final void mT__79() throws RecognitionException {
        try {
            int _type = T__79;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:55:7: ( 'string.h' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:55:9: 'string.h'
            {
            match("string.h"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__79"

    // $ANTLR start "T__80"
    public final void mT__80() throws RecognitionException {
        try {
            int _type = T__80;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:56:7: ( 'struct' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:56:9: 'struct'
            {
            match("struct"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__80"

    // $ANTLR start "T__81"
    public final void mT__81() throws RecognitionException {
        try {
            int _type = T__81;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:57:7: ( 'switch' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:57:9: 'switch'
            {
            match("switch"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__81"

    // $ANTLR start "T__82"
    public final void mT__82() throws RecognitionException {
        try {
            int _type = T__82;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:58:7: ( 'time.h' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:58:9: 'time.h'
            {
            match("time.h"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__82"

    // $ANTLR start "T__83"
    public final void mT__83() throws RecognitionException {
        try {
            int _type = T__83;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:59:7: ( 'unsigned' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:59:9: 'unsigned'
            {
            match("unsigned"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__83"

    // $ANTLR start "T__84"
    public final void mT__84() throws RecognitionException {
        try {
            int _type = T__84;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:60:7: ( 'void' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:60:9: 'void'
            {
            match("void"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__84"

    // $ANTLR start "T__85"
    public final void mT__85() throws RecognitionException {
        try {
            int _type = T__85;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:61:7: ( 'while' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:61:9: 'while'
            {
            match("while"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__85"

    // $ANTLR start "T__86"
    public final void mT__86() throws RecognitionException {
        try {
            int _type = T__86;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:62:7: ( '{' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:62:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__86"

    // $ANTLR start "T__87"
    public final void mT__87() throws RecognitionException {
        try {
            int _type = T__87;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:63:7: ( '||' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:63:9: '||'
            {
            match("||"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__87"

    // $ANTLR start "T__88"
    public final void mT__88() throws RecognitionException {
        try {
            int _type = T__88;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:64:7: ( '}' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:64:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__88"

    // $ANTLR start "T__89"
    public final void mT__89() throws RecognitionException {
        try {
            int _type = T__89;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:65:7: ( '~' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:65:9: '~'
            {
            match('~'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__89"

    // $ANTLR start "MULT"
    public final void mMULT() throws RecognitionException {
        try {
            int _type = MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:251:6: ( '*' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:251:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MULT"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:252:6: ( '/' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:252:8: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "MOD"
    public final void mMOD() throws RecognitionException {
        try {
            int _type = MOD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:253:6: ( '%' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:253:8: '%'
            {
            match('%'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MOD"

    // $ANTLR start "BREAK"
    public final void mBREAK() throws RecognitionException {
        try {
            int _type = BREAK;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:255:7: ( 'break' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:255:9: 'break'
            {
            match("break"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "BREAK"

    // $ANTLR start "CONTINUE"
    public final void mCONTINUE() throws RecognitionException {
        try {
            int _type = CONTINUE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:256:10: ( 'continue' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:256:12: 'continue'
            {
            match("continue"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CONTINUE"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:257:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:257:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:257:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT_LITERAL"
    public final void mINT_LITERAL() throws RecognitionException {
        try {
            int _type = INT_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:258:13: ( ( '0' .. '9' )+ )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:258:15: ( '0' .. '9' )+
            {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:258:15: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT_LITERAL"

    // $ANTLR start "FLOAT_LITERAL"
    public final void mFLOAT_LITERAL() throws RecognitionException {
        try {
            int _type = FLOAT_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:259:15: ( ( '0' .. '9' )+ '.' ( '0' .. '9' )* )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:259:17: ( '0' .. '9' )+ '.' ( '0' .. '9' )*
            {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:259:17: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0 >= '0' && LA3_0 <= '9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            match('.'); 

            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:259:33: ( '0' .. '9' )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0 >= '0' && LA4_0 <= '9')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT_LITERAL"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:260:16: ( '\"' ( StringCharacter )* '\"' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:260:18: '\"' ( StringCharacter )* '\"'
            {
            match('\"'); 

            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:260:22: ( StringCharacter )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0 >= '\u0000' && LA5_0 <= '!')||(LA5_0 >= '#' && LA5_0 <= '&')||(LA5_0 >= '(' && LA5_0 <= '\uFFFF')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:260:22: StringCharacter
            	    {
            	    mStringCharacter(); 


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);


            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "CHAR_LITERAL"
    public final void mCHAR_LITERAL() throws RecognitionException {
        try {
            int _type = CHAR_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:261:14: ( '\\'' StringCharacter '\\'' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:261:16: '\\'' StringCharacter '\\''
            {
            match('\''); 

            mStringCharacter(); 


            match('\''); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "CHAR_LITERAL"

    // $ANTLR start "StringCharacter"
    public final void mStringCharacter() throws RecognitionException {
        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:262:26: (~ ( '\\\\' | '\\'' | '\"' ) | '\\\\' . )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( ((LA6_0 >= '\u0000' && LA6_0 <= '!')||(LA6_0 >= '#' && LA6_0 <= '&')||(LA6_0 >= '(' && LA6_0 <= '[')||(LA6_0 >= ']' && LA6_0 <= '\uFFFF')) ) {
                alt6=1;
            }
            else if ( (LA6_0=='\\') ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:262:28: ~ ( '\\\\' | '\\'' | '\"' )
                    {
                    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '&')||(input.LA(1) >= '(' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;
                case 2 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:262:47: '\\\\' .
                    {
                    match('\\'); 

                    matchAny(); 

                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "StringCharacter"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:263:4: ( ( ' ' | '\\t' | '\\r' | '\\n' )+ )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:263:6: ( ' ' | '\\t' | '\\r' | '\\n' )+
            {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:263:6: ( ' ' | '\\t' | '\\r' | '\\n' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0 >= '\t' && LA7_0 <= '\n')||LA7_0=='\r'||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:
            	    {
            	    if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
            } while (true);


             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:264:9: ( '/*' ( options {greedy=false; } : . )* '*/' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:264:11: '/*' ( options {greedy=false; } : . )* '*/'
            {
            match("/*"); 



            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:264:16: ( options {greedy=false; } : . )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0=='*') ) {
                    int LA8_1 = input.LA(2);

                    if ( (LA8_1=='/') ) {
                        alt8=2;
                    }
                    else if ( ((LA8_1 >= '\u0000' && LA8_1 <= '.')||(LA8_1 >= '0' && LA8_1 <= '\uFFFF')) ) {
                        alt8=1;
                    }


                }
                else if ( ((LA8_0 >= '\u0000' && LA8_0 <= ')')||(LA8_0 >= '+' && LA8_0 <= '\uFFFF')) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:264:43: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);


            match("*/"); 



             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "LINE_COMMENT"
    public final void mLINE_COMMENT() throws RecognitionException {
        try {
            int _type = LINE_COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:265:14: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:265:16: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
            {
            match("//"); 



            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:265:21: (~ ( '\\n' | '\\r' ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( ((LA9_0 >= '\u0000' && LA9_0 <= '\t')||(LA9_0 >= '\u000B' && LA9_0 <= '\f')||(LA9_0 >= '\u000E' && LA9_0 <= '\uFFFF')) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:
            	    {
            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop9;
                }
            } while (true);


            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:265:35: ( '\\r' )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0=='\r') ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:265:35: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

             _channel = HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "LINE_COMMENT"

    public void mTokens() throws RecognitionException {
        // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:8: ( T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | MULT | DIV | MOD | BREAK | CONTINUE | ID | INT_LITERAL | FLOAT_LITERAL | STRING_LITERAL | CHAR_LITERAL | WS | COMMENT | LINE_COMMENT )
        int alt11=72;
        alt11 = dfa11.predict(input);
        switch (alt11) {
            case 1 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:10: T__31
                {
                mT__31(); 


                }
                break;
            case 2 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:16: T__32
                {
                mT__32(); 


                }
                break;
            case 3 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:22: T__33
                {
                mT__33(); 


                }
                break;
            case 4 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:28: T__34
                {
                mT__34(); 


                }
                break;
            case 5 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:34: T__35
                {
                mT__35(); 


                }
                break;
            case 6 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:40: T__36
                {
                mT__36(); 


                }
                break;
            case 7 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:46: T__37
                {
                mT__37(); 


                }
                break;
            case 8 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:52: T__38
                {
                mT__38(); 


                }
                break;
            case 9 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:58: T__39
                {
                mT__39(); 


                }
                break;
            case 10 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:64: T__40
                {
                mT__40(); 


                }
                break;
            case 11 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:70: T__41
                {
                mT__41(); 


                }
                break;
            case 12 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:76: T__42
                {
                mT__42(); 


                }
                break;
            case 13 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:82: T__43
                {
                mT__43(); 


                }
                break;
            case 14 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:88: T__44
                {
                mT__44(); 


                }
                break;
            case 15 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:94: T__45
                {
                mT__45(); 


                }
                break;
            case 16 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:100: T__46
                {
                mT__46(); 


                }
                break;
            case 17 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:106: T__47
                {
                mT__47(); 


                }
                break;
            case 18 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:112: T__48
                {
                mT__48(); 


                }
                break;
            case 19 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:118: T__49
                {
                mT__49(); 


                }
                break;
            case 20 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:124: T__50
                {
                mT__50(); 


                }
                break;
            case 21 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:130: T__51
                {
                mT__51(); 


                }
                break;
            case 22 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:136: T__52
                {
                mT__52(); 


                }
                break;
            case 23 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:142: T__53
                {
                mT__53(); 


                }
                break;
            case 24 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:148: T__54
                {
                mT__54(); 


                }
                break;
            case 25 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:154: T__55
                {
                mT__55(); 


                }
                break;
            case 26 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:160: T__56
                {
                mT__56(); 


                }
                break;
            case 27 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:166: T__57
                {
                mT__57(); 


                }
                break;
            case 28 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:172: T__58
                {
                mT__58(); 


                }
                break;
            case 29 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:178: T__59
                {
                mT__59(); 


                }
                break;
            case 30 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:184: T__60
                {
                mT__60(); 


                }
                break;
            case 31 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:190: T__61
                {
                mT__61(); 


                }
                break;
            case 32 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:196: T__62
                {
                mT__62(); 


                }
                break;
            case 33 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:202: T__63
                {
                mT__63(); 


                }
                break;
            case 34 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:208: T__64
                {
                mT__64(); 


                }
                break;
            case 35 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:214: T__65
                {
                mT__65(); 


                }
                break;
            case 36 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:220: T__66
                {
                mT__66(); 


                }
                break;
            case 37 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:226: T__67
                {
                mT__67(); 


                }
                break;
            case 38 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:232: T__68
                {
                mT__68(); 


                }
                break;
            case 39 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:238: T__69
                {
                mT__69(); 


                }
                break;
            case 40 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:244: T__70
                {
                mT__70(); 


                }
                break;
            case 41 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:250: T__71
                {
                mT__71(); 


                }
                break;
            case 42 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:256: T__72
                {
                mT__72(); 


                }
                break;
            case 43 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:262: T__73
                {
                mT__73(); 


                }
                break;
            case 44 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:268: T__74
                {
                mT__74(); 


                }
                break;
            case 45 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:274: T__75
                {
                mT__75(); 


                }
                break;
            case 46 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:280: T__76
                {
                mT__76(); 


                }
                break;
            case 47 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:286: T__77
                {
                mT__77(); 


                }
                break;
            case 48 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:292: T__78
                {
                mT__78(); 


                }
                break;
            case 49 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:298: T__79
                {
                mT__79(); 


                }
                break;
            case 50 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:304: T__80
                {
                mT__80(); 


                }
                break;
            case 51 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:310: T__81
                {
                mT__81(); 


                }
                break;
            case 52 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:316: T__82
                {
                mT__82(); 


                }
                break;
            case 53 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:322: T__83
                {
                mT__83(); 


                }
                break;
            case 54 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:328: T__84
                {
                mT__84(); 


                }
                break;
            case 55 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:334: T__85
                {
                mT__85(); 


                }
                break;
            case 56 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:340: T__86
                {
                mT__86(); 


                }
                break;
            case 57 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:346: T__87
                {
                mT__87(); 


                }
                break;
            case 58 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:352: T__88
                {
                mT__88(); 


                }
                break;
            case 59 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:358: T__89
                {
                mT__89(); 


                }
                break;
            case 60 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:364: MULT
                {
                mMULT(); 


                }
                break;
            case 61 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:369: DIV
                {
                mDIV(); 


                }
                break;
            case 62 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:373: MOD
                {
                mMOD(); 


                }
                break;
            case 63 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:377: BREAK
                {
                mBREAK(); 


                }
                break;
            case 64 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:383: CONTINUE
                {
                mCONTINUE(); 


                }
                break;
            case 65 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:392: ID
                {
                mID(); 


                }
                break;
            case 66 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:395: INT_LITERAL
                {
                mINT_LITERAL(); 


                }
                break;
            case 67 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:407: FLOAT_LITERAL
                {
                mFLOAT_LITERAL(); 


                }
                break;
            case 68 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:421: STRING_LITERAL
                {
                mSTRING_LITERAL(); 


                }
                break;
            case 69 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:436: CHAR_LITERAL
                {
                mCHAR_LITERAL(); 


                }
                break;
            case 70 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:449: WS
                {
                mWS(); 


                }
                break;
            case 71 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:452: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 72 :
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:1:460: LINE_COMMENT
                {
                mLINE_COMMENT(); 


                }
                break;

        }

    }


    protected DFA11 dfa11 = new DFA11(this);
    static final String DFA11_eotS =
        "\1\uffff\1\54\1\uffff\1\56\1\60\2\uffff\1\62\1\65\1\uffff\1\71\1"+
        "\73\1\77\2\uffff\1\101\1\103\1\105\2\uffff\15\46\4\uffff\1\46\1"+
        "\uffff\1\135\36\uffff\5\46\1\145\3\46\1\151\15\46\2\uffff\6\46\1"+
        "\uffff\2\46\1\u0080\1\uffff\1\u0081\15\46\1\u0091\1\u0092\4\46\1"+
        "\u0097\1\46\2\uffff\1\u0099\13\46\1\u00a5\2\46\2\uffff\4\46\1\uffff"+
        "\1\u00ac\1\uffff\2\46\1\u00af\6\46\1\uffff\1\46\1\uffff\1\u00b7"+
        "\1\u00b8\1\uffff\2\46\1\u00bb\1\uffff\1\u00bc\1\u00bd\1\uffff\1"+
        "\u00be\1\uffff\2\46\1\u00c1\1\u00c2\1\46\2\uffff\1\46\1\u00c5\10"+
        "\uffff\1\46\1\u00c7\1\uffff\1\u00c8\2\uffff";
    static final String DFA11_eofS =
        "\u00c9\uffff";
    static final String DFA11_minS =
        "\1\11\1\75\1\uffff\1\75\1\46\2\uffff\1\75\1\53\1\uffff\1\55\1\150"+
        "\1\52\2\uffff\3\75\2\uffff\1\141\1\145\2\154\1\146\1\157\1\162\1"+
        "\145\1\150\1\151\1\156\1\157\1\150\4\uffff\1\162\1\uffff\1\56\36"+
        "\uffff\1\163\1\141\1\171\1\156\1\146\1\60\1\163\1\157\1\162\1\60"+
        "\1\164\1\156\1\151\1\164\1\157\1\147\1\144\1\151\1\155\1\163\2\151"+
        "\1\145\2\uffff\1\145\1\162\1\160\1\164\1\141\1\142\1\uffff\1\145"+
        "\1\141\1\60\1\uffff\1\60\1\147\1\156\1\165\1\162\1\156\2\151\1\164"+
        "\1\145\1\151\1\144\1\154\1\141\2\60\1\145\1\151\1\165\1\154\1\60"+
        "\1\164\2\uffff\1\60\1\164\1\162\1\164\1\145\1\157\1\151\1\156\2"+
        "\143\1\56\1\147\1\60\1\145\1\153\2\uffff\1\56\1\156\1\154\1\145"+
        "\1\uffff\1\60\1\uffff\1\146\1\156\1\60\1\144\1\56\1\142\1\147\1"+
        "\164\1\150\1\uffff\1\156\1\uffff\2\60\1\uffff\1\165\1\164\1\60\1"+
        "\uffff\2\60\1\uffff\1\60\1\uffff\2\56\2\60\1\145\2\uffff\1\145\1"+
        "\60\10\uffff\1\144\1\60\1\uffff\1\60\2\uffff";
    static final String DFA11_maxS =
        "\1\176\1\75\1\uffff\1\75\1\46\2\uffff\2\75\1\uffff\1\76\1\150\1"+
        "\75\2\uffff\3\75\2\uffff\1\164\1\157\1\154\1\157\1\156\1\157\1\162"+
        "\1\145\1\167\1\151\1\156\1\157\1\150\4\uffff\1\162\1\uffff\1\71"+
        "\36\uffff\1\163\1\141\1\171\1\156\1\146\1\172\1\163\1\157\1\162"+
        "\1\172\1\164\1\156\1\151\1\164\1\157\1\147\1\162\1\151\1\155\1\163"+
        "\2\151\1\145\2\uffff\1\145\1\162\1\160\1\164\1\141\1\142\1\uffff"+
        "\1\145\1\141\1\172\1\uffff\1\172\1\147\1\156\1\165\1\162\1\156\1"+
        "\154\1\165\1\164\1\145\1\151\1\144\1\154\1\141\2\172\1\145\1\151"+
        "\1\165\1\154\1\172\1\164\2\uffff\1\172\1\164\1\162\1\164\1\145\1"+
        "\157\1\151\1\156\2\143\1\56\1\147\1\172\1\145\1\153\2\uffff\1\56"+
        "\1\156\1\154\1\145\1\uffff\1\172\1\uffff\1\146\1\156\1\172\1\144"+
        "\1\56\1\142\1\147\1\164\1\150\1\uffff\1\156\1\uffff\2\172\1\uffff"+
        "\1\165\1\164\1\172\1\uffff\2\172\1\uffff\1\172\1\uffff\2\56\2\172"+
        "\1\145\2\uffff\1\145\1\172\10\uffff\1\144\1\172\1\uffff\1\172\2"+
        "\uffff";
    static final String DFA11_acceptS =
        "\2\uffff\1\3\2\uffff\1\7\1\10\2\uffff\1\15\3\uffff\1\25\1\26\3\uffff"+
        "\1\35\1\36\15\uffff\1\70\1\71\1\72\1\73\1\uffff\1\101\1\uffff\1"+
        "\104\1\105\1\106\1\2\1\1\1\4\1\76\1\5\1\6\1\11\1\74\1\13\1\14\1"+
        "\12\1\17\1\20\1\21\1\16\1\23\1\22\1\24\1\107\1\110\1\75\1\30\1\27"+
        "\1\32\1\31\1\34\1\33\27\uffff\1\102\1\103\6\uffff\1\43\3\uffff\1"+
        "\50\26\uffff\1\47\1\51\17\uffff\1\37\1\40\4\uffff\1\45\1\uffff\1"+
        "\52\11\uffff\1\64\1\uffff\1\66\2\uffff\1\41\3\uffff\1\46\2\uffff"+
        "\1\55\1\uffff\1\57\5\uffff\1\67\1\77\2\uffff\1\44\1\53\1\54\1\56"+
        "\1\60\1\61\1\62\1\63\2\uffff\1\42\1\uffff\1\100\1\65";
    static final String DFA11_specialS =
        "\u00c9\uffff}>";
    static final String[] DFA11_transitionS = {
            "\2\52\2\uffff\1\52\22\uffff\1\52\1\1\1\50\1\2\1\uffff\1\3\1"+
            "\4\1\51\1\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14\12\47\1\15\1\16"+
            "\1\17\1\20\1\21\2\uffff\32\46\1\22\1\uffff\1\23\1\uffff\1\46"+
            "\1\uffff\1\46\1\45\1\24\1\25\1\26\1\27\2\46\1\30\2\46\1\31\3"+
            "\46\1\32\1\46\1\33\1\34\1\35\1\36\1\37\1\40\3\46\1\41\1\42\1"+
            "\43\1\44",
            "\1\53",
            "",
            "\1\55",
            "\1\57",
            "",
            "",
            "\1\61",
            "\1\63\21\uffff\1\64",
            "",
            "\1\66\17\uffff\1\67\1\70",
            "\1\72",
            "\1\75\4\uffff\1\76\15\uffff\1\74",
            "",
            "",
            "\1\100",
            "\1\102",
            "\1\104",
            "",
            "",
            "\1\106\6\uffff\1\107\6\uffff\1\111\4\uffff\1\110",
            "\1\112\11\uffff\1\113",
            "\1\114",
            "\1\115\2\uffff\1\116",
            "\1\117\7\uffff\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124\1\125\12\uffff\1\126\2\uffff\1\127",
            "\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "",
            "",
            "",
            "",
            "\1\134",
            "",
            "\1\136\1\uffff\12\47",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\137",
            "\1\140",
            "\1\141",
            "\1\142",
            "\1\143",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\24\46\1\144\5\46",
            "\1\146",
            "\1\147",
            "\1\150",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160\15\uffff\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "",
            "",
            "\1\170",
            "\1\171",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "",
            "\1\176",
            "\1\177",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087\2\uffff\1\u0088",
            "\1\u0089\13\uffff\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u0098",
            "",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00a6",
            "\1\u00a7",
            "",
            "",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00ad",
            "\1\u00ae",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "\1\u00b4",
            "\1\u00b5",
            "",
            "\1\u00b6",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00b9",
            "\1\u00ba",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\1\u00bf",
            "\1\u00c0",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "\1\u00c3",
            "",
            "",
            "\1\u00c4",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\u00c6",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            "\12\46\7\uffff\32\46\4\uffff\1\46\1\uffff\32\46",
            "",
            ""
    };

    static final short[] DFA11_eot = DFA.unpackEncodedString(DFA11_eotS);
    static final short[] DFA11_eof = DFA.unpackEncodedString(DFA11_eofS);
    static final char[] DFA11_min = DFA.unpackEncodedStringToUnsignedChars(DFA11_minS);
    static final char[] DFA11_max = DFA.unpackEncodedStringToUnsignedChars(DFA11_maxS);
    static final short[] DFA11_accept = DFA.unpackEncodedString(DFA11_acceptS);
    static final short[] DFA11_special = DFA.unpackEncodedString(DFA11_specialS);
    static final short[][] DFA11_transition;

    static {
        int numStates = DFA11_transitionS.length;
        DFA11_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA11_transition[i] = DFA.unpackEncodedString(DFA11_transitionS[i]);
        }
    }

    class DFA11 extends DFA {

        public DFA11(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 11;
            this.eot = DFA11_eot;
            this.eof = DFA11_eof;
            this.min = DFA11_min;
            this.max = DFA11_max;
            this.accept = DFA11_accept;
            this.special = DFA11_special;
            this.transition = DFA11_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | T__71 | T__72 | T__73 | T__74 | T__75 | T__76 | T__77 | T__78 | T__79 | T__80 | T__81 | T__82 | T__83 | T__84 | T__85 | T__86 | T__87 | T__88 | T__89 | MULT | DIV | MOD | BREAK | CONTINUE | ID | INT_LITERAL | FLOAT_LITERAL | STRING_LITERAL | CHAR_LITERAL | WS | COMMENT | LINE_COMMENT );";
        }
    }
 

}