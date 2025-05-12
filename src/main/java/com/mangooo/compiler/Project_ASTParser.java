package com.mangooo.compiler;// $ANTLR 3.4 N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g 2025-05-13 00:53:51

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class Project_ASTParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "ARRAY_INIT", "BLOCK", "BREAK", "CASE_STMT", "CHAR_LITERAL", "COMMENT", "CONTINUE", "DIV", "FLOAT_LITERAL", "FOR_INIT", "FUNC_DEF", "GLOBAL_DECLS", "ID", "INCLUDES", "INIT_LIST", "INT_LITERAL", "LINE_COMMENT", "MOD", "MULT", "PARAMS", "PROGRAM", "STRING_LITERAL", "STRUCT_DEF", "STRUCT_MEMBERS", "StringCharacter", "VAR_DECL", "WS", "'!'", "'!='", "'#include'", "'%='", "'&&'", "'&'", "'('", "')'", "'*='", "'+'", "'++'", "'+='", "','", "'-'", "'--'", "'-='", "'->'", "'.'", "'.h'", "'/='", "':'", "';'", "'<'", "'<='", "'='", "'=='", "'>'", "'>='", "'['", "']'", "'case'", "'char'", "'ctype.h'", "'default'", "'do'", "'double'", "'else'", "'float'", "'for'", "'if'", "'int'", "'long'", "'printf'", "'return'", "'short'", "'signed'", "'stdio.h'", "'stdlib.h'", "'string.h'", "'struct'", "'switch'", "'time.h'", "'unsigned'", "'void'", "'while'", "'{'", "'||'", "'}'", "'~'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public Project_ASTParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public Project_ASTParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return Project_ASTParser.tokenNames; }
    public String getGrammarFileName() { return "N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g"; }


    String s="";


    public static class program_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "program"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:28:1: program : includeDirectives globalDeclarations -> ^( PROGRAM includeDirectives globalDeclarations ) ;
    public final program_return program() throws RecognitionException {
        program_return retval = new program_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        includeDirectives_return includeDirectives1 =null;

        globalDeclarations_return globalDeclarations2 =null;


        RewriteRuleSubtreeStream stream_globalDeclarations=new RewriteRuleSubtreeStream(adaptor,"rule globalDeclarations");
        RewriteRuleSubtreeStream stream_includeDirectives=new RewriteRuleSubtreeStream(adaptor,"rule includeDirectives");
        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:29:5: ( includeDirectives globalDeclarations -> ^( PROGRAM includeDirectives globalDeclarations ) )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:29:7: includeDirectives globalDeclarations
            {
            pushFollow(FOLLOW_includeDirectives_in_program143);
            includeDirectives1=includeDirectives();

            state._fsp--;

            stream_includeDirectives.add(includeDirectives1.getTree());

            pushFollow(FOLLOW_globalDeclarations_in_program145);
            globalDeclarations2=globalDeclarations();

            state._fsp--;

            stream_globalDeclarations.add(globalDeclarations2.getTree());

            // AST REWRITE
            // elements: includeDirectives, globalDeclarations
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 29:44: -> ^( PROGRAM includeDirectives globalDeclarations )
            {
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:29:47: ^( PROGRAM includeDirectives globalDeclarations )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PROGRAM, "PROGRAM")
                , root_1);

                adaptor.addChild(root_1, stream_includeDirectives.nextTree());

                adaptor.addChild(root_1, stream_globalDeclarations.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (MismatchedTokenException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (NoViableAltException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }
        catch (RecognitionException e) {
             s = s +getErrorMessage(e,new String[]{e.input.toString()})+": "+getErrorHeader(e) +"\n";
        }

        finally {
        	// do for sure before leaving
             s = s + "Exit..."+"\n"; 
        }
        return retval;
    }
    // $ANTLR end "program"


    public static class includeDirectives_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "includeDirectives"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:37:1: includeDirectives : ( includeDirective )* -> ^( INCLUDES ( includeDirective )* ) ;
    public final includeDirectives_return includeDirectives() throws RecognitionException {
        includeDirectives_return retval = new includeDirectives_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        includeDirective_return includeDirective3 =null;


        RewriteRuleSubtreeStream stream_includeDirective=new RewriteRuleSubtreeStream(adaptor,"rule includeDirective");
        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:38:5: ( ( includeDirective )* -> ^( INCLUDES ( includeDirective )* ) )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:38:7: ( includeDirective )*
            {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:38:7: ( includeDirective )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==33) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:38:7: includeDirective
            	    {
            	    pushFollow(FOLLOW_includeDirective_in_includeDirectives205);
            	    includeDirective3=includeDirective();

            	    state._fsp--;

            	    stream_includeDirective.add(includeDirective3.getTree());

            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // AST REWRITE
            // elements: includeDirective
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 38:25: -> ^( INCLUDES ( includeDirective )* )
            {
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:38:28: ^( INCLUDES ( includeDirective )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INCLUDES, "INCLUDES")
                , root_1);

                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:38:39: ( includeDirective )*
                while ( stream_includeDirective.hasNext() ) {
                    adaptor.addChild(root_1, stream_includeDirective.nextTree());

                }
                stream_includeDirective.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "includeDirectives"


    public static class includeDirective_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "includeDirective"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:41:1: includeDirective : '#include' '<' libraryName '>' -> ^( '#include' libraryName ) ;
    public final includeDirective_return includeDirective() throws RecognitionException {
        includeDirective_return retval = new includeDirective_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal4=null;
        Token char_literal5=null;
        Token char_literal7=null;
        libraryName_return libraryName6 =null;


        Object string_literal4_tree=null;
        Object char_literal5_tree=null;
        Object char_literal7_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleTokenStream stream_57=new RewriteRuleTokenStream(adaptor,"token 57");
        RewriteRuleTokenStream stream_53=new RewriteRuleTokenStream(adaptor,"token 53");
        RewriteRuleSubtreeStream stream_libraryName=new RewriteRuleSubtreeStream(adaptor,"rule libraryName");
        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:42:5: ( '#include' '<' libraryName '>' -> ^( '#include' libraryName ) )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:42:7: '#include' '<' libraryName '>'
            {
            string_literal4=(Token)match(input,33,FOLLOW_33_in_includeDirective232);  
            stream_33.add(string_literal4);


            char_literal5=(Token)match(input,53,FOLLOW_53_in_includeDirective234);  
            stream_53.add(char_literal5);


            pushFollow(FOLLOW_libraryName_in_includeDirective236);
            libraryName6=libraryName();

            state._fsp--;

            stream_libraryName.add(libraryName6.getTree());

            char_literal7=(Token)match(input,57,FOLLOW_57_in_includeDirective238);  
            stream_57.add(char_literal7);


            // AST REWRITE
            // elements: 33, libraryName
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 42:38: -> ^( '#include' libraryName )
            {
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:42:41: ^( '#include' libraryName )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                stream_33.nextNode()
                , root_1);

                adaptor.addChild(root_1, stream_libraryName.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "includeDirective"


    public static class libraryName_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "libraryName"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:45:1: libraryName : ( 'stdio.h' | 'string.h' | 'ctype.h' | 'stdlib.h' | 'time.h' | ID '.h' );
    public final libraryName_return libraryName() throws RecognitionException {
        libraryName_return retval = new libraryName_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal8=null;
        Token string_literal9=null;
        Token string_literal10=null;
        Token string_literal11=null;
        Token string_literal12=null;
        Token ID13=null;
        Token string_literal14=null;

        Object string_literal8_tree=null;
        Object string_literal9_tree=null;
        Object string_literal10_tree=null;
        Object string_literal11_tree=null;
        Object string_literal12_tree=null;
        Object ID13_tree=null;
        Object string_literal14_tree=null;

        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:46:5: ( 'stdio.h' | 'string.h' | 'ctype.h' | 'stdlib.h' | 'time.h' | ID '.h' )
            int alt2=6;
            switch ( input.LA(1) ) {
            case 77:
                {
                alt2=1;
                }
                break;
            case 79:
                {
                alt2=2;
                }
                break;
            case 63:
                {
                alt2=3;
                }
                break;
            case 78:
                {
                alt2=4;
                }
                break;
            case 82:
                {
                alt2=5;
                }
                break;
            case ID:
                {
                alt2=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:46:7: 'stdio.h'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal8=(Token)match(input,77,FOLLOW_77_in_libraryName263); 
                    string_literal8_tree = 
                    (Object)adaptor.create(string_literal8)
                    ;
                    adaptor.addChild(root_0, string_literal8_tree);


                    }
                    break;
                case 2 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:47:7: 'string.h'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal9=(Token)match(input,79,FOLLOW_79_in_libraryName271); 
                    string_literal9_tree = 
                    (Object)adaptor.create(string_literal9)
                    ;
                    adaptor.addChild(root_0, string_literal9_tree);


                    }
                    break;
                case 3 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:48:7: 'ctype.h'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal10=(Token)match(input,63,FOLLOW_63_in_libraryName279); 
                    string_literal10_tree = 
                    (Object)adaptor.create(string_literal10)
                    ;
                    adaptor.addChild(root_0, string_literal10_tree);


                    }
                    break;
                case 4 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:49:7: 'stdlib.h'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal11=(Token)match(input,78,FOLLOW_78_in_libraryName287); 
                    string_literal11_tree = 
                    (Object)adaptor.create(string_literal11)
                    ;
                    adaptor.addChild(root_0, string_literal11_tree);


                    }
                    break;
                case 5 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:50:7: 'time.h'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal12=(Token)match(input,82,FOLLOW_82_in_libraryName295); 
                    string_literal12_tree = 
                    (Object)adaptor.create(string_literal12)
                    ;
                    adaptor.addChild(root_0, string_literal12_tree);


                    }
                    break;
                case 6 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:51:7: ID '.h'
                    {
                    root_0 = (Object)adaptor.nil();


                    ID13=(Token)match(input,ID,FOLLOW_ID_in_libraryName303); 
                    ID13_tree = 
                    (Object)adaptor.create(ID13)
                    ;
                    adaptor.addChild(root_0, ID13_tree);


                    string_literal14=(Token)match(input,49,FOLLOW_49_in_libraryName305); 
                    string_literal14_tree = 
                    (Object)adaptor.create(string_literal14)
                    ;
                    adaptor.addChild(root_0, string_literal14_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "libraryName"


    public static class globalDeclarations_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "globalDeclarations"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:54:1: globalDeclarations : ( structDefinition | globalVariableDeclaration | functionDefinition )* -> ^( GLOBAL_DECLS ( structDefinition )* ( globalVariableDeclaration )* ( functionDefinition )* ) ;
    public final globalDeclarations_return globalDeclarations() throws RecognitionException {
        globalDeclarations_return retval = new globalDeclarations_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        structDefinition_return structDefinition15 =null;

        globalVariableDeclaration_return globalVariableDeclaration16 =null;

        functionDefinition_return functionDefinition17 =null;


        RewriteRuleSubtreeStream stream_globalVariableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule globalVariableDeclaration");
        RewriteRuleSubtreeStream stream_functionDefinition=new RewriteRuleSubtreeStream(adaptor,"rule functionDefinition");
        RewriteRuleSubtreeStream stream_structDefinition=new RewriteRuleSubtreeStream(adaptor,"rule structDefinition");
        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:55:5: ( ( structDefinition | globalVariableDeclaration | functionDefinition )* -> ^( GLOBAL_DECLS ( structDefinition )* ( globalVariableDeclaration )* ( functionDefinition )* ) )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:55:7: ( structDefinition | globalVariableDeclaration | functionDefinition )*
            {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:55:7: ( structDefinition | globalVariableDeclaration | functionDefinition )*
            loop3:
            do {
                int alt3=4;
                switch ( input.LA(1) ) {
                case 80:
                    {
                    int LA3_2 = input.LA(2);

                    if ( (LA3_2==ID) ) {
                        switch ( input.LA(3) ) {
                        case 86:
                            {
                            alt3=1;
                            }
                            break;
                        case ID:
                            {
                            int LA3_13 = input.LA(4);

                            if ( (LA3_13==52||LA3_13==55||LA3_13==59) ) {
                                alt3=2;
                            }
                            else if ( (LA3_13==37) ) {
                                alt3=3;
                            }


                            }
                            break;
                        case MULT:
                            {
                            alt3=2;
                            }
                            break;

                        }

                    }


                    }
                    break;
                case 71:
                    {
                    int LA3_3 = input.LA(2);

                    if ( (LA3_3==ID) ) {
                        int LA3_13 = input.LA(3);

                        if ( (LA3_13==52||LA3_13==55||LA3_13==59) ) {
                            alt3=2;
                        }
                        else if ( (LA3_13==37) ) {
                            alt3=3;
                        }


                    }
                    else if ( (LA3_3==MULT) ) {
                        alt3=2;
                    }


                    }
                    break;
                case 62:
                    {
                    int LA3_4 = input.LA(2);

                    if ( (LA3_4==ID) ) {
                        int LA3_13 = input.LA(3);

                        if ( (LA3_13==52||LA3_13==55||LA3_13==59) ) {
                            alt3=2;
                        }
                        else if ( (LA3_13==37) ) {
                            alt3=3;
                        }


                    }
                    else if ( (LA3_4==MULT) ) {
                        alt3=2;
                    }


                    }
                    break;
                case 68:
                    {
                    int LA3_5 = input.LA(2);

                    if ( (LA3_5==ID) ) {
                        int LA3_13 = input.LA(3);

                        if ( (LA3_13==52||LA3_13==55||LA3_13==59) ) {
                            alt3=2;
                        }
                        else if ( (LA3_13==37) ) {
                            alt3=3;
                        }


                    }
                    else if ( (LA3_5==MULT) ) {
                        alt3=2;
                    }


                    }
                    break;
                case 66:
                    {
                    int LA3_6 = input.LA(2);

                    if ( (LA3_6==ID) ) {
                        int LA3_13 = input.LA(3);

                        if ( (LA3_13==52||LA3_13==55||LA3_13==59) ) {
                            alt3=2;
                        }
                        else if ( (LA3_13==37) ) {
                            alt3=3;
                        }


                    }
                    else if ( (LA3_6==MULT) ) {
                        alt3=2;
                    }


                    }
                    break;
                case 72:
                    {
                    int LA3_7 = input.LA(2);

                    if ( (LA3_7==ID) ) {
                        int LA3_13 = input.LA(3);

                        if ( (LA3_13==52||LA3_13==55||LA3_13==59) ) {
                            alt3=2;
                        }
                        else if ( (LA3_13==37) ) {
                            alt3=3;
                        }


                    }
                    else if ( (LA3_7==MULT) ) {
                        alt3=2;
                    }


                    }
                    break;
                case 75:
                    {
                    int LA3_8 = input.LA(2);

                    if ( (LA3_8==ID) ) {
                        int LA3_13 = input.LA(3);

                        if ( (LA3_13==52||LA3_13==55||LA3_13==59) ) {
                            alt3=2;
                        }
                        else if ( (LA3_13==37) ) {
                            alt3=3;
                        }


                    }
                    else if ( (LA3_8==MULT) ) {
                        alt3=2;
                    }


                    }
                    break;
                case 83:
                    {
                    int LA3_9 = input.LA(2);

                    if ( (LA3_9==ID) ) {
                        int LA3_13 = input.LA(3);

                        if ( (LA3_13==52||LA3_13==55||LA3_13==59) ) {
                            alt3=2;
                        }
                        else if ( (LA3_13==37) ) {
                            alt3=3;
                        }


                    }
                    else if ( (LA3_9==MULT) ) {
                        alt3=2;
                    }


                    }
                    break;
                case 76:
                    {
                    int LA3_10 = input.LA(2);

                    if ( (LA3_10==ID) ) {
                        int LA3_13 = input.LA(3);

                        if ( (LA3_13==52||LA3_13==55||LA3_13==59) ) {
                            alt3=2;
                        }
                        else if ( (LA3_13==37) ) {
                            alt3=3;
                        }


                    }
                    else if ( (LA3_10==MULT) ) {
                        alt3=2;
                    }


                    }
                    break;
                case 84:
                    {
                    alt3=3;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:55:8: structDefinition
            	    {
            	    pushFollow(FOLLOW_structDefinition_in_globalDeclarations323);
            	    structDefinition15=structDefinition();

            	    state._fsp--;

            	    stream_structDefinition.add(structDefinition15.getTree());

            	    }
            	    break;
            	case 2 :
            	    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:55:27: globalVariableDeclaration
            	    {
            	    pushFollow(FOLLOW_globalVariableDeclaration_in_globalDeclarations327);
            	    globalVariableDeclaration16=globalVariableDeclaration();

            	    state._fsp--;

            	    stream_globalVariableDeclaration.add(globalVariableDeclaration16.getTree());

            	    }
            	    break;
            	case 3 :
            	    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:55:55: functionDefinition
            	    {
            	    pushFollow(FOLLOW_functionDefinition_in_globalDeclarations331);
            	    functionDefinition17=functionDefinition();

            	    state._fsp--;

            	    stream_functionDefinition.add(functionDefinition17.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            // AST REWRITE
            // elements: globalVariableDeclaration, functionDefinition, structDefinition
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 55:76: -> ^( GLOBAL_DECLS ( structDefinition )* ( globalVariableDeclaration )* ( functionDefinition )* )
            {
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:55:79: ^( GLOBAL_DECLS ( structDefinition )* ( globalVariableDeclaration )* ( functionDefinition )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(GLOBAL_DECLS, "GLOBAL_DECLS")
                , root_1);

                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:55:94: ( structDefinition )*
                while ( stream_structDefinition.hasNext() ) {
                    adaptor.addChild(root_1, stream_structDefinition.nextTree());

                }
                stream_structDefinition.reset();

                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:55:112: ( globalVariableDeclaration )*
                while ( stream_globalVariableDeclaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_globalVariableDeclaration.nextTree());

                }
                stream_globalVariableDeclaration.reset();

                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:55:139: ( functionDefinition )*
                while ( stream_functionDefinition.hasNext() ) {
                    adaptor.addChild(root_1, stream_functionDefinition.nextTree());

                }
                stream_functionDefinition.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "globalDeclarations"


    public static class structDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "structDefinition"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:58:1: structDefinition : 'struct' ID '{' structMembers '}' ';' -> ^( STRUCT_DEF ID structMembers ) ;
    public final structDefinition_return structDefinition() throws RecognitionException {
        structDefinition_return retval = new structDefinition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal18=null;
        Token ID19=null;
        Token char_literal20=null;
        Token char_literal22=null;
        Token char_literal23=null;
        structMembers_return structMembers21 =null;


        Object string_literal18_tree=null;
        Object ID19_tree=null;
        Object char_literal20_tree=null;
        Object char_literal22_tree=null;
        Object char_literal23_tree=null;
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleTokenStream stream_80=new RewriteRuleTokenStream(adaptor,"token 80");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleSubtreeStream stream_structMembers=new RewriteRuleSubtreeStream(adaptor,"rule structMembers");
        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:59:5: ( 'struct' ID '{' structMembers '}' ';' -> ^( STRUCT_DEF ID structMembers ) )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:59:7: 'struct' ID '{' structMembers '}' ';'
            {
            string_literal18=(Token)match(input,80,FOLLOW_80_in_structDefinition365);  
            stream_80.add(string_literal18);


            ID19=(Token)match(input,ID,FOLLOW_ID_in_structDefinition367);  
            stream_ID.add(ID19);


            char_literal20=(Token)match(input,86,FOLLOW_86_in_structDefinition369);  
            stream_86.add(char_literal20);


            pushFollow(FOLLOW_structMembers_in_structDefinition371);
            structMembers21=structMembers();

            state._fsp--;

            stream_structMembers.add(structMembers21.getTree());

            char_literal22=(Token)match(input,88,FOLLOW_88_in_structDefinition373);  
            stream_88.add(char_literal22);


            char_literal23=(Token)match(input,52,FOLLOW_52_in_structDefinition375);  
            stream_52.add(char_literal23);


            // AST REWRITE
            // elements: structMembers, ID
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 59:45: -> ^( STRUCT_DEF ID structMembers )
            {
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:59:48: ^( STRUCT_DEF ID structMembers )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(STRUCT_DEF, "STRUCT_DEF")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, stream_structMembers.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "structDefinition"


    public static class structMembers_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "structMembers"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:62:1: structMembers : ( variableDeclaration )+ -> ^( STRUCT_MEMBERS ( variableDeclaration )+ ) ;
    public final structMembers_return structMembers() throws RecognitionException {
        structMembers_return retval = new structMembers_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        variableDeclaration_return variableDeclaration24 =null;


        RewriteRuleSubtreeStream stream_variableDeclaration=new RewriteRuleSubtreeStream(adaptor,"rule variableDeclaration");
        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:63:5: ( ( variableDeclaration )+ -> ^( STRUCT_MEMBERS ( variableDeclaration )+ ) )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:63:7: ( variableDeclaration )+
            {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:63:7: ( variableDeclaration )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==62||LA4_0==66||LA4_0==68||(LA4_0 >= 71 && LA4_0 <= 72)||(LA4_0 >= 75 && LA4_0 <= 76)||LA4_0==80||LA4_0==83) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:63:8: variableDeclaration
            	    {
            	    pushFollow(FOLLOW_variableDeclaration_in_structMembers403);
            	    variableDeclaration24=variableDeclaration();

            	    state._fsp--;

            	    stream_variableDeclaration.add(variableDeclaration24.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            // AST REWRITE
            // elements: variableDeclaration
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 63:30: -> ^( STRUCT_MEMBERS ( variableDeclaration )+ )
            {
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:63:33: ^( STRUCT_MEMBERS ( variableDeclaration )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(STRUCT_MEMBERS, "STRUCT_MEMBERS")
                , root_1);

                if ( !(stream_variableDeclaration.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_variableDeclaration.hasNext() ) {
                    adaptor.addChild(root_1, stream_variableDeclaration.nextTree());

                }
                stream_variableDeclaration.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "structMembers"


    public static class variableDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "variableDeclaration"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:66:1: variableDeclaration : dataType declarator ';' -> ^( VAR_DECL dataType declarator ) ;
    public final variableDeclaration_return variableDeclaration() throws RecognitionException {
        variableDeclaration_return retval = new variableDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal27=null;
        dataType_return dataType25 =null;

        declarator_return declarator26 =null;


        Object char_literal27_tree=null;
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_dataType=new RewriteRuleSubtreeStream(adaptor,"rule dataType");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:67:5: ( dataType declarator ';' -> ^( VAR_DECL dataType declarator ) )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:67:7: dataType declarator ';'
            {
            pushFollow(FOLLOW_dataType_in_variableDeclaration431);
            dataType25=dataType();

            state._fsp--;

            stream_dataType.add(dataType25.getTree());

            pushFollow(FOLLOW_declarator_in_variableDeclaration433);
            declarator26=declarator();

            state._fsp--;

            stream_declarator.add(declarator26.getTree());

            char_literal27=(Token)match(input,52,FOLLOW_52_in_variableDeclaration435);  
            stream_52.add(char_literal27);


            // AST REWRITE
            // elements: declarator, dataType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 67:31: -> ^( VAR_DECL dataType declarator )
            {
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:67:34: ^( VAR_DECL dataType declarator )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VAR_DECL, "VAR_DECL")
                , root_1);

                adaptor.addChild(root_1, stream_dataType.nextTree());

                adaptor.addChild(root_1, stream_declarator.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "variableDeclaration"


    public static class declarator_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declarator"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:70:1: declarator : ( ID | ID '[' ( constantExpression )? ']' | '*' ID );
    public final declarator_return declarator() throws RecognitionException {
        declarator_return retval = new declarator_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID28=null;
        Token ID29=null;
        Token char_literal30=null;
        Token char_literal32=null;
        Token char_literal33=null;
        Token ID34=null;
        constantExpression_return constantExpression31 =null;


        Object ID28_tree=null;
        Object ID29_tree=null;
        Object char_literal30_tree=null;
        Object char_literal32_tree=null;
        Object char_literal33_tree=null;
        Object ID34_tree=null;

        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:71:5: ( ID | ID '[' ( constantExpression )? ']' | '*' ID )
            int alt6=3;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==ID) ) {
                int LA6_1 = input.LA(2);

                if ( (LA6_1==59) ) {
                    alt6=2;
                }
                else if ( (LA6_1==52||LA6_1==55) ) {
                    alt6=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;

                }
            }
            else if ( (LA6_0==MULT) ) {
                alt6=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;

            }
            switch (alt6) {
                case 1 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:71:7: ID
                    {
                    root_0 = (Object)adaptor.nil();


                    ID28=(Token)match(input,ID,FOLLOW_ID_in_declarator462); 
                    ID28_tree = 
                    (Object)adaptor.create(ID28)
                    ;
                    adaptor.addChild(root_0, ID28_tree);


                    }
                    break;
                case 2 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:72:7: ID '[' ( constantExpression )? ']'
                    {
                    root_0 = (Object)adaptor.nil();


                    ID29=(Token)match(input,ID,FOLLOW_ID_in_declarator470); 
                    ID29_tree = 
                    (Object)adaptor.create(ID29)
                    ;
                    adaptor.addChild(root_0, ID29_tree);


                    char_literal30=(Token)match(input,59,FOLLOW_59_in_declarator472); 
                    char_literal30_tree = 
                    (Object)adaptor.create(char_literal30)
                    ;
                    adaptor.addChild(root_0, char_literal30_tree);


                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:72:14: ( constantExpression )?
                    int alt5=2;
                    int LA5_0 = input.LA(1);

                    if ( (LA5_0==ID||LA5_0==INT_LITERAL) ) {
                        alt5=1;
                    }
                    switch (alt5) {
                        case 1 :
                            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:72:14: constantExpression
                            {
                            pushFollow(FOLLOW_constantExpression_in_declarator474);
                            constantExpression31=constantExpression();

                            state._fsp--;

                            adaptor.addChild(root_0, constantExpression31.getTree());

                            }
                            break;

                    }


                    char_literal32=(Token)match(input,60,FOLLOW_60_in_declarator477); 
                    char_literal32_tree = 
                    (Object)adaptor.create(char_literal32)
                    ;
                    adaptor.addChild(root_0, char_literal32_tree);


                    }
                    break;
                case 3 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:73:7: '*' ID
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal33=(Token)match(input,MULT,FOLLOW_MULT_in_declarator485); 
                    char_literal33_tree = 
                    (Object)adaptor.create(char_literal33)
                    ;
                    adaptor.addChild(root_0, char_literal33_tree);


                    ID34=(Token)match(input,ID,FOLLOW_ID_in_declarator487); 
                    ID34_tree = 
                    (Object)adaptor.create(ID34)
                    ;
                    adaptor.addChild(root_0, ID34_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declarator"


    public static class constantExpression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "constantExpression"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:76:1: constantExpression : ( INT_LITERAL | ID );
    public final constantExpression_return constantExpression() throws RecognitionException {
        constantExpression_return retval = new constantExpression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set35=null;

        Object set35_tree=null;

        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:77:5: ( INT_LITERAL | ID )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:
            {
            root_0 = (Object)adaptor.nil();


            set35=(Token)input.LT(1);

            if ( input.LA(1)==ID||input.LA(1)==INT_LITERAL ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set35)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "constantExpression"


    public static class globalVariableDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "globalVariableDeclaration"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:81:1: globalVariableDeclaration : dataType declarator ( '=' initializer )? ';' -> ^( VAR_DECL dataType declarator ( initializer )? ) ;
    public final globalVariableDeclaration_return globalVariableDeclaration() throws RecognitionException {
        globalVariableDeclaration_return retval = new globalVariableDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal38=null;
        Token char_literal40=null;
        dataType_return dataType36 =null;

        declarator_return declarator37 =null;

        initializer_return initializer39 =null;


        Object char_literal38_tree=null;
        Object char_literal40_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_dataType=new RewriteRuleSubtreeStream(adaptor,"rule dataType");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");
        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:82:5: ( dataType declarator ( '=' initializer )? ';' -> ^( VAR_DECL dataType declarator ( initializer )? ) )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:82:7: dataType declarator ( '=' initializer )? ';'
            {
            pushFollow(FOLLOW_dataType_in_globalVariableDeclaration529);
            dataType36=dataType();

            state._fsp--;

            stream_dataType.add(dataType36.getTree());

            pushFollow(FOLLOW_declarator_in_globalVariableDeclaration531);
            declarator37=declarator();

            state._fsp--;

            stream_declarator.add(declarator37.getTree());

            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:82:27: ( '=' initializer )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==55) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:82:28: '=' initializer
                    {
                    char_literal38=(Token)match(input,55,FOLLOW_55_in_globalVariableDeclaration534);  
                    stream_55.add(char_literal38);


                    pushFollow(FOLLOW_initializer_in_globalVariableDeclaration536);
                    initializer39=initializer();

                    state._fsp--;

                    stream_initializer.add(initializer39.getTree());

                    }
                    break;

            }


            char_literal40=(Token)match(input,52,FOLLOW_52_in_globalVariableDeclaration540);  
            stream_52.add(char_literal40);


            // AST REWRITE
            // elements: declarator, initializer, dataType
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 82:50: -> ^( VAR_DECL dataType declarator ( initializer )? )
            {
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:82:53: ^( VAR_DECL dataType declarator ( initializer )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VAR_DECL, "VAR_DECL")
                , root_1);

                adaptor.addChild(root_1, stream_dataType.nextTree());

                adaptor.addChild(root_1, stream_declarator.nextTree());

                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:82:84: ( initializer )?
                if ( stream_initializer.hasNext() ) {
                    adaptor.addChild(root_1, stream_initializer.nextTree());

                }
                stream_initializer.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "globalVariableDeclaration"


    public static class initializer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "initializer"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:85:1: initializer : ( expression | arrayInitializer );
    public final initializer_return initializer() throws RecognitionException {
        initializer_return retval = new initializer_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        expression_return expression41 =null;

        arrayInitializer_return arrayInitializer42 =null;



        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:86:5: ( expression | arrayInitializer )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==CHAR_LITERAL||LA8_0==FLOAT_LITERAL||LA8_0==ID||LA8_0==INT_LITERAL||LA8_0==MULT||LA8_0==STRING_LITERAL||LA8_0==31||(LA8_0 >= 36 && LA8_0 <= 37)||(LA8_0 >= 40 && LA8_0 <= 41)||(LA8_0 >= 44 && LA8_0 <= 45)||LA8_0==89) ) {
                alt8=1;
            }
            else if ( (LA8_0==86) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }
            switch (alt8) {
                case 1 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:86:7: expression
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expression_in_initializer570);
                    expression41=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression41.getTree());

                    }
                    break;
                case 2 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:87:7: arrayInitializer
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_arrayInitializer_in_initializer578);
                    arrayInitializer42=arrayInitializer();

                    state._fsp--;

                    adaptor.addChild(root_0, arrayInitializer42.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "initializer"


    public static class arrayInitializer_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "arrayInitializer"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:90:1: arrayInitializer : '{' ( initializerList )? '}' -> ^( ARRAY_INIT ( initializerList )? ) ;
    public final arrayInitializer_return arrayInitializer() throws RecognitionException {
        arrayInitializer_return retval = new arrayInitializer_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal43=null;
        Token char_literal45=null;
        initializerList_return initializerList44 =null;


        Object char_literal43_tree=null;
        Object char_literal45_tree=null;
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleSubtreeStream stream_initializerList=new RewriteRuleSubtreeStream(adaptor,"rule initializerList");
        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:91:5: ( '{' ( initializerList )? '}' -> ^( ARRAY_INIT ( initializerList )? ) )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:91:7: '{' ( initializerList )? '}'
            {
            char_literal43=(Token)match(input,86,FOLLOW_86_in_arrayInitializer595);  
            stream_86.add(char_literal43);


            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:91:11: ( initializerList )?
            int alt9=2;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==CHAR_LITERAL||LA9_0==FLOAT_LITERAL||LA9_0==ID||LA9_0==INT_LITERAL||LA9_0==MULT||LA9_0==STRING_LITERAL||LA9_0==31||(LA9_0 >= 36 && LA9_0 <= 37)||(LA9_0 >= 40 && LA9_0 <= 41)||(LA9_0 >= 44 && LA9_0 <= 45)||LA9_0==86||LA9_0==89) ) {
                alt9=1;
            }
            switch (alt9) {
                case 1 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:91:11: initializerList
                    {
                    pushFollow(FOLLOW_initializerList_in_arrayInitializer597);
                    initializerList44=initializerList();

                    state._fsp--;

                    stream_initializerList.add(initializerList44.getTree());

                    }
                    break;

            }


            char_literal45=(Token)match(input,88,FOLLOW_88_in_arrayInitializer600);  
            stream_88.add(char_literal45);


            // AST REWRITE
            // elements: initializerList
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 91:32: -> ^( ARRAY_INIT ( initializerList )? )
            {
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:91:35: ^( ARRAY_INIT ( initializerList )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(ARRAY_INIT, "ARRAY_INIT")
                , root_1);

                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:91:48: ( initializerList )?
                if ( stream_initializerList.hasNext() ) {
                    adaptor.addChild(root_1, stream_initializerList.nextTree());

                }
                stream_initializerList.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "arrayInitializer"


    public static class initializerList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "initializerList"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:94:1: initializerList : initializer ( ',' initializer )* -> ^( INIT_LIST ( initializer )+ ) ;
    public final initializerList_return initializerList() throws RecognitionException {
        initializerList_return retval = new initializerList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal47=null;
        initializer_return initializer46 =null;

        initializer_return initializer48 =null;


        Object char_literal47_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");
        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:95:5: ( initializer ( ',' initializer )* -> ^( INIT_LIST ( initializer )+ ) )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:95:7: initializer ( ',' initializer )*
            {
            pushFollow(FOLLOW_initializer_in_initializerList626);
            initializer46=initializer();

            state._fsp--;

            stream_initializer.add(initializer46.getTree());

            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:95:19: ( ',' initializer )*
            loop10:
            do {
                int alt10=2;
                int LA10_0 = input.LA(1);

                if ( (LA10_0==43) ) {
                    alt10=1;
                }


                switch (alt10) {
            	case 1 :
            	    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:95:20: ',' initializer
            	    {
            	    char_literal47=(Token)match(input,43,FOLLOW_43_in_initializerList629);  
            	    stream_43.add(char_literal47);


            	    pushFollow(FOLLOW_initializer_in_initializerList631);
            	    initializer48=initializer();

            	    state._fsp--;

            	    stream_initializer.add(initializer48.getTree());

            	    }
            	    break;

            	default :
            	    break loop10;
                }
            } while (true);


            // AST REWRITE
            // elements: initializer
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 95:38: -> ^( INIT_LIST ( initializer )+ )
            {
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:95:41: ^( INIT_LIST ( initializer )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(INIT_LIST, "INIT_LIST")
                , root_1);

                if ( !(stream_initializer.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_initializer.hasNext() ) {
                    adaptor.addChild(root_1, stream_initializer.nextTree());

                }
                stream_initializer.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "initializerList"


    public static class functionDefinition_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "functionDefinition"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:98:1: functionDefinition : (retType= dataType | 'void' ) ID '(' ( parameterList )? ')' compoundStatement -> ^( FUNC_DEF ( $retType)? ID ( parameterList )? compoundStatement ) ;
    public final functionDefinition_return functionDefinition() throws RecognitionException {
        functionDefinition_return retval = new functionDefinition_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal49=null;
        Token ID50=null;
        Token char_literal51=null;
        Token char_literal53=null;
        dataType_return retType =null;

        parameterList_return parameterList52 =null;

        compoundStatement_return compoundStatement54 =null;


        Object string_literal49_tree=null;
        Object ID50_tree=null;
        Object char_literal51_tree=null;
        Object char_literal53_tree=null;
        RewriteRuleTokenStream stream_37=new RewriteRuleTokenStream(adaptor,"token 37");
        RewriteRuleTokenStream stream_38=new RewriteRuleTokenStream(adaptor,"token 38");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_84=new RewriteRuleTokenStream(adaptor,"token 84");
        RewriteRuleSubtreeStream stream_dataType=new RewriteRuleSubtreeStream(adaptor,"rule dataType");
        RewriteRuleSubtreeStream stream_compoundStatement=new RewriteRuleSubtreeStream(adaptor,"rule compoundStatement");
        RewriteRuleSubtreeStream stream_parameterList=new RewriteRuleSubtreeStream(adaptor,"rule parameterList");
        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:99:5: ( (retType= dataType | 'void' ) ID '(' ( parameterList )? ')' compoundStatement -> ^( FUNC_DEF ( $retType)? ID ( parameterList )? compoundStatement ) )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:99:7: (retType= dataType | 'void' ) ID '(' ( parameterList )? ')' compoundStatement
            {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:99:7: (retType= dataType | 'void' )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==62||LA11_0==66||LA11_0==68||(LA11_0 >= 71 && LA11_0 <= 72)||(LA11_0 >= 75 && LA11_0 <= 76)||LA11_0==80||LA11_0==83) ) {
                alt11=1;
            }
            else if ( (LA11_0==84) ) {
                alt11=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;

            }
            switch (alt11) {
                case 1 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:99:8: retType= dataType
                    {
                    pushFollow(FOLLOW_dataType_in_functionDefinition662);
                    retType=dataType();

                    state._fsp--;

                    stream_dataType.add(retType.getTree());

                    }
                    break;
                case 2 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:99:27: 'void'
                    {
                    string_literal49=(Token)match(input,84,FOLLOW_84_in_functionDefinition666);  
                    stream_84.add(string_literal49);


                    }
                    break;

            }


            ID50=(Token)match(input,ID,FOLLOW_ID_in_functionDefinition669);  
            stream_ID.add(ID50);


            char_literal51=(Token)match(input,37,FOLLOW_37_in_functionDefinition671);  
            stream_37.add(char_literal51);


            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:99:42: ( parameterList )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==62||LA12_0==66||LA12_0==68||(LA12_0 >= 71 && LA12_0 <= 72)||(LA12_0 >= 75 && LA12_0 <= 76)||LA12_0==80||LA12_0==83) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:99:42: parameterList
                    {
                    pushFollow(FOLLOW_parameterList_in_functionDefinition673);
                    parameterList52=parameterList();

                    state._fsp--;

                    stream_parameterList.add(parameterList52.getTree());

                    }
                    break;

            }


            char_literal53=(Token)match(input,38,FOLLOW_38_in_functionDefinition676);  
            stream_38.add(char_literal53);


            pushFollow(FOLLOW_compoundStatement_in_functionDefinition678);
            compoundStatement54=compoundStatement();

            state._fsp--;

            stream_compoundStatement.add(compoundStatement54.getTree());

            // AST REWRITE
            // elements: compoundStatement, ID, retType, parameterList
            // token labels: 
            // rule labels: retType, retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retType=new RewriteRuleSubtreeStream(adaptor,"rule retType",retType!=null?retType.tree:null);
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 100:7: -> ^( FUNC_DEF ( $retType)? ID ( parameterList )? compoundStatement )
            {
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:100:10: ^( FUNC_DEF ( $retType)? ID ( parameterList )? compoundStatement )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(FUNC_DEF, "FUNC_DEF")
                , root_1);

                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:100:22: ( $retType)?
                if ( stream_retType.hasNext() ) {
                    adaptor.addChild(root_1, stream_retType.nextTree());

                }
                stream_retType.reset();

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:100:34: ( parameterList )?
                if ( stream_parameterList.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameterList.nextTree());

                }
                stream_parameterList.reset();

                adaptor.addChild(root_1, stream_compoundStatement.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "functionDefinition"


    public static class parameterList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameterList"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:103:1: parameterList : parameter ( ',' parameter )* -> ^( PARAMS ( parameter )+ ) ;
    public final parameterList_return parameterList() throws RecognitionException {
        parameterList_return retval = new parameterList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal56=null;
        parameter_return parameter55 =null;

        parameter_return parameter57 =null;


        Object char_literal56_tree=null;
        RewriteRuleTokenStream stream_43=new RewriteRuleTokenStream(adaptor,"token 43");
        RewriteRuleSubtreeStream stream_parameter=new RewriteRuleSubtreeStream(adaptor,"rule parameter");
        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:104:5: ( parameter ( ',' parameter )* -> ^( PARAMS ( parameter )+ ) )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:104:7: parameter ( ',' parameter )*
            {
            pushFollow(FOLLOW_parameter_in_parameterList719);
            parameter55=parameter();

            state._fsp--;

            stream_parameter.add(parameter55.getTree());

            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:104:17: ( ',' parameter )*
            loop13:
            do {
                int alt13=2;
                int LA13_0 = input.LA(1);

                if ( (LA13_0==43) ) {
                    alt13=1;
                }


                switch (alt13) {
            	case 1 :
            	    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:104:18: ',' parameter
            	    {
            	    char_literal56=(Token)match(input,43,FOLLOW_43_in_parameterList722);  
            	    stream_43.add(char_literal56);


            	    pushFollow(FOLLOW_parameter_in_parameterList724);
            	    parameter57=parameter();

            	    state._fsp--;

            	    stream_parameter.add(parameter57.getTree());

            	    }
            	    break;

            	default :
            	    break loop13;
                }
            } while (true);


            // AST REWRITE
            // elements: parameter
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 104:34: -> ^( PARAMS ( parameter )+ )
            {
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:104:37: ^( PARAMS ( parameter )+ )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(PARAMS, "PARAMS")
                , root_1);

                if ( !(stream_parameter.hasNext()) ) {
                    throw new RewriteEarlyExitException();
                }
                while ( stream_parameter.hasNext() ) {
                    adaptor.addChild(root_1, stream_parameter.nextTree());

                }
                stream_parameter.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parameterList"


    public static class parameter_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "parameter"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:107:1: parameter : ( dataType ID ( '[' ']' )? | dataType '*' ID );
    public final parameter_return parameter() throws RecognitionException {
        parameter_return retval = new parameter_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID59=null;
        Token char_literal60=null;
        Token char_literal61=null;
        Token char_literal63=null;
        Token ID64=null;
        dataType_return dataType58 =null;

        dataType_return dataType62 =null;


        Object ID59_tree=null;
        Object char_literal60_tree=null;
        Object char_literal61_tree=null;
        Object char_literal63_tree=null;
        Object ID64_tree=null;

        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:108:5: ( dataType ID ( '[' ']' )? | dataType '*' ID )
            int alt15=2;
            switch ( input.LA(1) ) {
            case 71:
                {
                int LA15_1 = input.LA(2);

                if ( (LA15_1==ID) ) {
                    alt15=1;
                }
                else if ( (LA15_1==MULT) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 1, input);

                    throw nvae;

                }
                }
                break;
            case 62:
                {
                int LA15_2 = input.LA(2);

                if ( (LA15_2==ID) ) {
                    alt15=1;
                }
                else if ( (LA15_2==MULT) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 2, input);

                    throw nvae;

                }
                }
                break;
            case 68:
                {
                int LA15_3 = input.LA(2);

                if ( (LA15_3==ID) ) {
                    alt15=1;
                }
                else if ( (LA15_3==MULT) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 3, input);

                    throw nvae;

                }
                }
                break;
            case 66:
                {
                int LA15_4 = input.LA(2);

                if ( (LA15_4==ID) ) {
                    alt15=1;
                }
                else if ( (LA15_4==MULT) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 4, input);

                    throw nvae;

                }
                }
                break;
            case 72:
                {
                int LA15_5 = input.LA(2);

                if ( (LA15_5==ID) ) {
                    alt15=1;
                }
                else if ( (LA15_5==MULT) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 5, input);

                    throw nvae;

                }
                }
                break;
            case 75:
                {
                int LA15_6 = input.LA(2);

                if ( (LA15_6==ID) ) {
                    alt15=1;
                }
                else if ( (LA15_6==MULT) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 6, input);

                    throw nvae;

                }
                }
                break;
            case 83:
                {
                int LA15_7 = input.LA(2);

                if ( (LA15_7==ID) ) {
                    alt15=1;
                }
                else if ( (LA15_7==MULT) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 7, input);

                    throw nvae;

                }
                }
                break;
            case 76:
                {
                int LA15_8 = input.LA(2);

                if ( (LA15_8==ID) ) {
                    alt15=1;
                }
                else if ( (LA15_8==MULT) ) {
                    alt15=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 8, input);

                    throw nvae;

                }
                }
                break;
            case 80:
                {
                int LA15_9 = input.LA(2);

                if ( (LA15_9==ID) ) {
                    int LA15_12 = input.LA(3);

                    if ( (LA15_12==ID) ) {
                        alt15=1;
                    }
                    else if ( (LA15_12==MULT) ) {
                        alt15=2;
                    }
                    else {
                        NoViableAltException nvae =
                            new NoViableAltException("", 15, 12, input);

                        throw nvae;

                    }
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 15, 9, input);

                    throw nvae;

                }
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 15, 0, input);

                throw nvae;

            }

            switch (alt15) {
                case 1 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:108:7: dataType ID ( '[' ']' )?
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_dataType_in_parameter752);
                    dataType58=dataType();

                    state._fsp--;

                    adaptor.addChild(root_0, dataType58.getTree());

                    ID59=(Token)match(input,ID,FOLLOW_ID_in_parameter754); 
                    ID59_tree = 
                    (Object)adaptor.create(ID59)
                    ;
                    adaptor.addChild(root_0, ID59_tree);


                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:108:19: ( '[' ']' )?
                    int alt14=2;
                    int LA14_0 = input.LA(1);

                    if ( (LA14_0==59) ) {
                        alt14=1;
                    }
                    switch (alt14) {
                        case 1 :
                            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:108:20: '[' ']'
                            {
                            char_literal60=(Token)match(input,59,FOLLOW_59_in_parameter757); 
                            char_literal60_tree = 
                            (Object)adaptor.create(char_literal60)
                            ;
                            adaptor.addChild(root_0, char_literal60_tree);


                            char_literal61=(Token)match(input,60,FOLLOW_60_in_parameter759); 
                            char_literal61_tree = 
                            (Object)adaptor.create(char_literal61)
                            ;
                            adaptor.addChild(root_0, char_literal61_tree);


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:109:7: dataType '*' ID
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_dataType_in_parameter769);
                    dataType62=dataType();

                    state._fsp--;

                    adaptor.addChild(root_0, dataType62.getTree());

                    char_literal63=(Token)match(input,MULT,FOLLOW_MULT_in_parameter771); 
                    char_literal63_tree = 
                    (Object)adaptor.create(char_literal63)
                    ;
                    adaptor.addChild(root_0, char_literal63_tree);


                    ID64=(Token)match(input,ID,FOLLOW_ID_in_parameter773); 
                    ID64_tree = 
                    (Object)adaptor.create(ID64)
                    ;
                    adaptor.addChild(root_0, ID64_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "parameter"


    public static class compoundStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compoundStatement"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:112:1: compoundStatement : '{' ( statement )* '}' -> ^( BLOCK ( statement )* ) ;
    public final compoundStatement_return compoundStatement() throws RecognitionException {
        compoundStatement_return retval = new compoundStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal65=null;
        Token char_literal67=null;
        statement_return statement66 =null;


        Object char_literal65_tree=null;
        Object char_literal67_tree=null;
        RewriteRuleTokenStream stream_88=new RewriteRuleTokenStream(adaptor,"token 88");
        RewriteRuleTokenStream stream_86=new RewriteRuleTokenStream(adaptor,"token 86");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:113:5: ( '{' ( statement )* '}' -> ^( BLOCK ( statement )* ) )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:113:7: '{' ( statement )* '}'
            {
            char_literal65=(Token)match(input,86,FOLLOW_86_in_compoundStatement790);  
            stream_86.add(char_literal65);


            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:113:11: ( statement )*
            loop16:
            do {
                int alt16=2;
                int LA16_0 = input.LA(1);

                if ( (LA16_0==BREAK||LA16_0==CHAR_LITERAL||LA16_0==CONTINUE||LA16_0==FLOAT_LITERAL||LA16_0==ID||LA16_0==INT_LITERAL||LA16_0==MULT||LA16_0==STRING_LITERAL||LA16_0==31||(LA16_0 >= 36 && LA16_0 <= 37)||(LA16_0 >= 40 && LA16_0 <= 41)||(LA16_0 >= 44 && LA16_0 <= 45)||LA16_0==52||LA16_0==62||(LA16_0 >= 65 && LA16_0 <= 66)||(LA16_0 >= 68 && LA16_0 <= 76)||(LA16_0 >= 80 && LA16_0 <= 81)||LA16_0==83||(LA16_0 >= 85 && LA16_0 <= 86)||LA16_0==89) ) {
                    alt16=1;
                }


                switch (alt16) {
            	case 1 :
            	    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:113:11: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_compoundStatement792);
            	    statement66=statement();

            	    state._fsp--;

            	    stream_statement.add(statement66.getTree());

            	    }
            	    break;

            	default :
            	    break loop16;
                }
            } while (true);


            char_literal67=(Token)match(input,88,FOLLOW_88_in_compoundStatement795);  
            stream_88.add(char_literal67);


            // AST REWRITE
            // elements: statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 113:26: -> ^( BLOCK ( statement )* )
            {
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:113:29: ^( BLOCK ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(BLOCK, "BLOCK")
                , root_1);

                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:113:37: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "compoundStatement"


    public static class statement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "statement"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:116:1: statement : ( compoundStatement | localVariableDeclaration | ifStatement | switchStatement | forStatement | whileStatement | doWhileStatement | returnStatement | printStatement | BREAK ';' | CONTINUE ';' | expressionStatement );
    public final statement_return statement() throws RecognitionException {
        statement_return retval = new statement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token BREAK77=null;
        Token char_literal78=null;
        Token CONTINUE79=null;
        Token char_literal80=null;
        compoundStatement_return compoundStatement68 =null;

        localVariableDeclaration_return localVariableDeclaration69 =null;

        ifStatement_return ifStatement70 =null;

        switchStatement_return switchStatement71 =null;

        forStatement_return forStatement72 =null;

        whileStatement_return whileStatement73 =null;

        doWhileStatement_return doWhileStatement74 =null;

        returnStatement_return returnStatement75 =null;

        printStatement_return printStatement76 =null;

        expressionStatement_return expressionStatement81 =null;


        Object BREAK77_tree=null;
        Object char_literal78_tree=null;
        Object CONTINUE79_tree=null;
        Object char_literal80_tree=null;

        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:117:5: ( compoundStatement | localVariableDeclaration | ifStatement | switchStatement | forStatement | whileStatement | doWhileStatement | returnStatement | printStatement | BREAK ';' | CONTINUE ';' | expressionStatement )
            int alt17=12;
            switch ( input.LA(1) ) {
            case 86:
                {
                alt17=1;
                }
                break;
            case 62:
            case 66:
            case 68:
            case 71:
            case 72:
            case 75:
            case 76:
            case 80:
            case 83:
                {
                alt17=2;
                }
                break;
            case 70:
                {
                alt17=3;
                }
                break;
            case 81:
                {
                alt17=4;
                }
                break;
            case 69:
                {
                alt17=5;
                }
                break;
            case 85:
                {
                alt17=6;
                }
                break;
            case 65:
                {
                alt17=7;
                }
                break;
            case 74:
                {
                alt17=8;
                }
                break;
            case 73:
                {
                alt17=9;
                }
                break;
            case BREAK:
                {
                alt17=10;
                }
                break;
            case CONTINUE:
                {
                alt17=11;
                }
                break;
            case CHAR_LITERAL:
            case FLOAT_LITERAL:
            case ID:
            case INT_LITERAL:
            case MULT:
            case STRING_LITERAL:
            case 31:
            case 36:
            case 37:
            case 40:
            case 41:
            case 44:
            case 45:
            case 52:
            case 89:
                {
                alt17=12;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;

            }

            switch (alt17) {
                case 1 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:117:7: compoundStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_compoundStatement_in_statement821);
                    compoundStatement68=compoundStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, compoundStatement68.getTree());

                    }
                    break;
                case 2 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:118:7: localVariableDeclaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_localVariableDeclaration_in_statement829);
                    localVariableDeclaration69=localVariableDeclaration();

                    state._fsp--;

                    adaptor.addChild(root_0, localVariableDeclaration69.getTree());

                    }
                    break;
                case 3 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:119:7: ifStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_ifStatement_in_statement837);
                    ifStatement70=ifStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, ifStatement70.getTree());

                    }
                    break;
                case 4 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:120:7: switchStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_switchStatement_in_statement845);
                    switchStatement71=switchStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, switchStatement71.getTree());

                    }
                    break;
                case 5 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:121:7: forStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_forStatement_in_statement853);
                    forStatement72=forStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, forStatement72.getTree());

                    }
                    break;
                case 6 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:122:7: whileStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_whileStatement_in_statement861);
                    whileStatement73=whileStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, whileStatement73.getTree());

                    }
                    break;
                case 7 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:123:7: doWhileStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_doWhileStatement_in_statement869);
                    doWhileStatement74=doWhileStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, doWhileStatement74.getTree());

                    }
                    break;
                case 8 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:124:7: returnStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_returnStatement_in_statement877);
                    returnStatement75=returnStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, returnStatement75.getTree());

                    }
                    break;
                case 9 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:125:7: printStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_printStatement_in_statement885);
                    printStatement76=printStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, printStatement76.getTree());

                    }
                    break;
                case 10 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:126:7: BREAK ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    BREAK77=(Token)match(input,BREAK,FOLLOW_BREAK_in_statement893); 
                    BREAK77_tree = 
                    (Object)adaptor.create(BREAK77)
                    ;
                    adaptor.addChild(root_0, BREAK77_tree);


                    char_literal78=(Token)match(input,52,FOLLOW_52_in_statement895); 
                    char_literal78_tree = 
                    (Object)adaptor.create(char_literal78)
                    ;
                    adaptor.addChild(root_0, char_literal78_tree);


                    }
                    break;
                case 11 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:127:7: CONTINUE ';'
                    {
                    root_0 = (Object)adaptor.nil();


                    CONTINUE79=(Token)match(input,CONTINUE,FOLLOW_CONTINUE_in_statement903); 
                    CONTINUE79_tree = 
                    (Object)adaptor.create(CONTINUE79)
                    ;
                    adaptor.addChild(root_0, CONTINUE79_tree);


                    char_literal80=(Token)match(input,52,FOLLOW_52_in_statement905); 
                    char_literal80_tree = 
                    (Object)adaptor.create(char_literal80)
                    ;
                    adaptor.addChild(root_0, char_literal80_tree);


                    }
                    break;
                case 12 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:128:7: expressionStatement
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_expressionStatement_in_statement913);
                    expressionStatement81=expressionStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, expressionStatement81.getTree());

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "statement"


    public static class printStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "printStatement"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:131:1: printStatement : 'printf' '(' ( stringArg )? ( ',' expression )* ')' ';' ;
    public final printStatement_return printStatement() throws RecognitionException {
        printStatement_return retval = new printStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal82=null;
        Token char_literal83=null;
        Token char_literal85=null;
        Token char_literal87=null;
        Token char_literal88=null;
        stringArg_return stringArg84 =null;

        expression_return expression86 =null;


        Object string_literal82_tree=null;
        Object char_literal83_tree=null;
        Object char_literal85_tree=null;
        Object char_literal87_tree=null;
        Object char_literal88_tree=null;

        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:132:5: ( 'printf' '(' ( stringArg )? ( ',' expression )* ')' ';' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:132:7: 'printf' '(' ( stringArg )? ( ',' expression )* ')' ';'
            {
            root_0 = (Object)adaptor.nil();


            string_literal82=(Token)match(input,73,FOLLOW_73_in_printStatement930); 
            string_literal82_tree = 
            (Object)adaptor.create(string_literal82)
            ;
            adaptor.addChild(root_0, string_literal82_tree);


            char_literal83=(Token)match(input,37,FOLLOW_37_in_printStatement932); 
            char_literal83_tree = 
            (Object)adaptor.create(char_literal83)
            ;
            adaptor.addChild(root_0, char_literal83_tree);


            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:132:20: ( stringArg )?
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==STRING_LITERAL) ) {
                alt18=1;
            }
            switch (alt18) {
                case 1 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:132:20: stringArg
                    {
                    pushFollow(FOLLOW_stringArg_in_printStatement934);
                    stringArg84=stringArg();

                    state._fsp--;

                    adaptor.addChild(root_0, stringArg84.getTree());

                    }
                    break;

            }


            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:132:31: ( ',' expression )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==43) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:132:32: ',' expression
            	    {
            	    char_literal85=(Token)match(input,43,FOLLOW_43_in_printStatement938); 
            	    char_literal85_tree = 
            	    (Object)adaptor.create(char_literal85)
            	    ;
            	    adaptor.addChild(root_0, char_literal85_tree);


            	    pushFollow(FOLLOW_expression_in_printStatement940);
            	    expression86=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression86.getTree());

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            char_literal87=(Token)match(input,38,FOLLOW_38_in_printStatement944); 
            char_literal87_tree = 
            (Object)adaptor.create(char_literal87)
            ;
            adaptor.addChild(root_0, char_literal87_tree);


            char_literal88=(Token)match(input,52,FOLLOW_52_in_printStatement946); 
            char_literal88_tree = 
            (Object)adaptor.create(char_literal88)
            ;
            adaptor.addChild(root_0, char_literal88_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "printStatement"


    public static class stringArg_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stringArg"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:135:1: stringArg : STRING_LITERAL ;
    public final stringArg_return stringArg() throws RecognitionException {
        stringArg_return retval = new stringArg_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token STRING_LITERAL89=null;

        Object STRING_LITERAL89_tree=null;

        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:136:5: ( STRING_LITERAL )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:136:7: STRING_LITERAL
            {
            root_0 = (Object)adaptor.nil();


            STRING_LITERAL89=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_stringArg963); 
            STRING_LITERAL89_tree = 
            (Object)adaptor.create(STRING_LITERAL89)
            ;
            adaptor.addChild(root_0, STRING_LITERAL89_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stringArg"


    public static class localVariableDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "localVariableDeclaration"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:139:1: localVariableDeclaration : dataType declarator ( '=' initializer )? ';' -> ^( VAR_DECL dataType declarator ( initializer )? ) ;
    public final localVariableDeclaration_return localVariableDeclaration() throws RecognitionException {
        localVariableDeclaration_return retval = new localVariableDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal92=null;
        Token char_literal94=null;
        dataType_return dataType90 =null;

        declarator_return declarator91 =null;

        initializer_return initializer93 =null;


        Object char_literal92_tree=null;
        Object char_literal94_tree=null;
        RewriteRuleTokenStream stream_55=new RewriteRuleTokenStream(adaptor,"token 55");
        RewriteRuleTokenStream stream_52=new RewriteRuleTokenStream(adaptor,"token 52");
        RewriteRuleSubtreeStream stream_dataType=new RewriteRuleSubtreeStream(adaptor,"rule dataType");
        RewriteRuleSubtreeStream stream_declarator=new RewriteRuleSubtreeStream(adaptor,"rule declarator");
        RewriteRuleSubtreeStream stream_initializer=new RewriteRuleSubtreeStream(adaptor,"rule initializer");
        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:140:5: ( dataType declarator ( '=' initializer )? ';' -> ^( VAR_DECL dataType declarator ( initializer )? ) )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:140:7: dataType declarator ( '=' initializer )? ';'
            {
            pushFollow(FOLLOW_dataType_in_localVariableDeclaration980);
            dataType90=dataType();

            state._fsp--;

            stream_dataType.add(dataType90.getTree());

            pushFollow(FOLLOW_declarator_in_localVariableDeclaration982);
            declarator91=declarator();

            state._fsp--;

            stream_declarator.add(declarator91.getTree());

            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:140:27: ( '=' initializer )?
            int alt20=2;
            int LA20_0 = input.LA(1);

            if ( (LA20_0==55) ) {
                alt20=1;
            }
            switch (alt20) {
                case 1 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:140:28: '=' initializer
                    {
                    char_literal92=(Token)match(input,55,FOLLOW_55_in_localVariableDeclaration985);  
                    stream_55.add(char_literal92);


                    pushFollow(FOLLOW_initializer_in_localVariableDeclaration987);
                    initializer93=initializer();

                    state._fsp--;

                    stream_initializer.add(initializer93.getTree());

                    }
                    break;

            }


            char_literal94=(Token)match(input,52,FOLLOW_52_in_localVariableDeclaration991);  
            stream_52.add(char_literal94);


            // AST REWRITE
            // elements: initializer, dataType, declarator
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 140:50: -> ^( VAR_DECL dataType declarator ( initializer )? )
            {
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:140:53: ^( VAR_DECL dataType declarator ( initializer )? )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(VAR_DECL, "VAR_DECL")
                , root_1);

                adaptor.addChild(root_1, stream_dataType.nextTree());

                adaptor.addChild(root_1, stream_declarator.nextTree());

                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:140:84: ( initializer )?
                if ( stream_initializer.hasNext() ) {
                    adaptor.addChild(root_1, stream_initializer.nextTree());

                }
                stream_initializer.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "localVariableDeclaration"


    public static class ifStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "ifStatement"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:143:1: ifStatement : 'if' '(' expression ')' statement ( options {greedy=true; } : 'else' statement )? ;
    public final ifStatement_return ifStatement() throws RecognitionException {
        ifStatement_return retval = new ifStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal95=null;
        Token char_literal96=null;
        Token char_literal98=null;
        Token string_literal100=null;
        expression_return expression97 =null;

        statement_return statement99 =null;

        statement_return statement101 =null;


        Object string_literal95_tree=null;
        Object char_literal96_tree=null;
        Object char_literal98_tree=null;
        Object string_literal100_tree=null;

        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:144:5: ( 'if' '(' expression ')' statement ( options {greedy=true; } : 'else' statement )? )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:144:7: 'if' '(' expression ')' statement ( options {greedy=true; } : 'else' statement )?
            {
            root_0 = (Object)adaptor.nil();


            string_literal95=(Token)match(input,70,FOLLOW_70_in_ifStatement1021); 
            string_literal95_tree = 
            (Object)adaptor.create(string_literal95)
            ;
            adaptor.addChild(root_0, string_literal95_tree);


            char_literal96=(Token)match(input,37,FOLLOW_37_in_ifStatement1023); 
            char_literal96_tree = 
            (Object)adaptor.create(char_literal96)
            ;
            adaptor.addChild(root_0, char_literal96_tree);


            pushFollow(FOLLOW_expression_in_ifStatement1025);
            expression97=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression97.getTree());

            char_literal98=(Token)match(input,38,FOLLOW_38_in_ifStatement1027); 
            char_literal98_tree = 
            (Object)adaptor.create(char_literal98)
            ;
            adaptor.addChild(root_0, char_literal98_tree);


            pushFollow(FOLLOW_statement_in_ifStatement1029);
            statement99=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement99.getTree());

            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:144:41: ( options {greedy=true; } : 'else' statement )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==67) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:144:67: 'else' statement
                    {
                    string_literal100=(Token)match(input,67,FOLLOW_67_in_ifStatement1041); 
                    string_literal100_tree = 
                    (Object)adaptor.create(string_literal100)
                    ;
                    adaptor.addChild(root_0, string_literal100_tree);


                    pushFollow(FOLLOW_statement_in_ifStatement1043);
                    statement101=statement();

                    state._fsp--;

                    adaptor.addChild(root_0, statement101.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "ifStatement"


    public static class switchStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "switchStatement"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:147:1: switchStatement : 'switch' '(' expression ')' '{' ( caseStatement )* ( defaultStatement )? '}' ;
    public final switchStatement_return switchStatement() throws RecognitionException {
        switchStatement_return retval = new switchStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal102=null;
        Token char_literal103=null;
        Token char_literal105=null;
        Token char_literal106=null;
        Token char_literal109=null;
        expression_return expression104 =null;

        caseStatement_return caseStatement107 =null;

        defaultStatement_return defaultStatement108 =null;


        Object string_literal102_tree=null;
        Object char_literal103_tree=null;
        Object char_literal105_tree=null;
        Object char_literal106_tree=null;
        Object char_literal109_tree=null;

        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:148:5: ( 'switch' '(' expression ')' '{' ( caseStatement )* ( defaultStatement )? '}' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:148:7: 'switch' '(' expression ')' '{' ( caseStatement )* ( defaultStatement )? '}'
            {
            root_0 = (Object)adaptor.nil();


            string_literal102=(Token)match(input,81,FOLLOW_81_in_switchStatement1062); 
            string_literal102_tree = 
            (Object)adaptor.create(string_literal102)
            ;
            adaptor.addChild(root_0, string_literal102_tree);


            char_literal103=(Token)match(input,37,FOLLOW_37_in_switchStatement1064); 
            char_literal103_tree = 
            (Object)adaptor.create(char_literal103)
            ;
            adaptor.addChild(root_0, char_literal103_tree);


            pushFollow(FOLLOW_expression_in_switchStatement1066);
            expression104=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression104.getTree());

            char_literal105=(Token)match(input,38,FOLLOW_38_in_switchStatement1068); 
            char_literal105_tree = 
            (Object)adaptor.create(char_literal105)
            ;
            adaptor.addChild(root_0, char_literal105_tree);


            char_literal106=(Token)match(input,86,FOLLOW_86_in_switchStatement1070); 
            char_literal106_tree = 
            (Object)adaptor.create(char_literal106)
            ;
            adaptor.addChild(root_0, char_literal106_tree);


            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:148:39: ( caseStatement )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==61) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:148:39: caseStatement
            	    {
            	    pushFollow(FOLLOW_caseStatement_in_switchStatement1072);
            	    caseStatement107=caseStatement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, caseStatement107.getTree());

            	    }
            	    break;

            	default :
            	    break loop22;
                }
            } while (true);


            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:148:54: ( defaultStatement )?
            int alt23=2;
            int LA23_0 = input.LA(1);

            if ( (LA23_0==64) ) {
                alt23=1;
            }
            switch (alt23) {
                case 1 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:148:54: defaultStatement
                    {
                    pushFollow(FOLLOW_defaultStatement_in_switchStatement1075);
                    defaultStatement108=defaultStatement();

                    state._fsp--;

                    adaptor.addChild(root_0, defaultStatement108.getTree());

                    }
                    break;

            }


            char_literal109=(Token)match(input,88,FOLLOW_88_in_switchStatement1078); 
            char_literal109_tree = 
            (Object)adaptor.create(char_literal109)
            ;
            adaptor.addChild(root_0, char_literal109_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "switchStatement"


    public static class caseStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "caseStatement"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:151:1: caseStatement : 'case' INT_LITERAL ':' ( statement )* -> ^( CASE_STMT INT_LITERAL ( statement )* ) ;
    public final caseStatement_return caseStatement() throws RecognitionException {
        caseStatement_return retval = new caseStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal110=null;
        Token INT_LITERAL111=null;
        Token char_literal112=null;
        statement_return statement113 =null;


        Object string_literal110_tree=null;
        Object INT_LITERAL111_tree=null;
        Object char_literal112_tree=null;
        RewriteRuleTokenStream stream_INT_LITERAL=new RewriteRuleTokenStream(adaptor,"token INT_LITERAL");
        RewriteRuleTokenStream stream_61=new RewriteRuleTokenStream(adaptor,"token 61");
        RewriteRuleTokenStream stream_51=new RewriteRuleTokenStream(adaptor,"token 51");
        RewriteRuleSubtreeStream stream_statement=new RewriteRuleSubtreeStream(adaptor,"rule statement");
        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:152:5: ( 'case' INT_LITERAL ':' ( statement )* -> ^( CASE_STMT INT_LITERAL ( statement )* ) )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:152:7: 'case' INT_LITERAL ':' ( statement )*
            {
            string_literal110=(Token)match(input,61,FOLLOW_61_in_caseStatement1095);  
            stream_61.add(string_literal110);


            INT_LITERAL111=(Token)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_caseStatement1097);  
            stream_INT_LITERAL.add(INT_LITERAL111);


            char_literal112=(Token)match(input,51,FOLLOW_51_in_caseStatement1099);  
            stream_51.add(char_literal112);


            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:152:30: ( statement )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==BREAK||LA24_0==CHAR_LITERAL||LA24_0==CONTINUE||LA24_0==FLOAT_LITERAL||LA24_0==ID||LA24_0==INT_LITERAL||LA24_0==MULT||LA24_0==STRING_LITERAL||LA24_0==31||(LA24_0 >= 36 && LA24_0 <= 37)||(LA24_0 >= 40 && LA24_0 <= 41)||(LA24_0 >= 44 && LA24_0 <= 45)||LA24_0==52||LA24_0==62||(LA24_0 >= 65 && LA24_0 <= 66)||(LA24_0 >= 68 && LA24_0 <= 76)||(LA24_0 >= 80 && LA24_0 <= 81)||LA24_0==83||(LA24_0 >= 85 && LA24_0 <= 86)||LA24_0==89) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:152:30: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_caseStatement1101);
            	    statement113=statement();

            	    state._fsp--;

            	    stream_statement.add(statement113.getTree());

            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);


            // AST REWRITE
            // elements: INT_LITERAL, statement
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 152:41: -> ^( CASE_STMT INT_LITERAL ( statement )* )
            {
                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:152:44: ^( CASE_STMT INT_LITERAL ( statement )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(CASE_STMT, "CASE_STMT")
                , root_1);

                adaptor.addChild(root_1, 
                stream_INT_LITERAL.nextNode()
                );

                // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:152:68: ( statement )*
                while ( stream_statement.hasNext() ) {
                    adaptor.addChild(root_1, stream_statement.nextTree());

                }
                stream_statement.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "caseStatement"


    public static class defaultStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "defaultStatement"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:155:1: defaultStatement : 'default' ':' ( statement )* ;
    public final defaultStatement_return defaultStatement() throws RecognitionException {
        defaultStatement_return retval = new defaultStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal114=null;
        Token char_literal115=null;
        statement_return statement116 =null;


        Object string_literal114_tree=null;
        Object char_literal115_tree=null;

        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:156:5: ( 'default' ':' ( statement )* )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:156:7: 'default' ':' ( statement )*
            {
            root_0 = (Object)adaptor.nil();


            string_literal114=(Token)match(input,64,FOLLOW_64_in_defaultStatement1130); 
            string_literal114_tree = 
            (Object)adaptor.create(string_literal114)
            ;
            adaptor.addChild(root_0, string_literal114_tree);


            char_literal115=(Token)match(input,51,FOLLOW_51_in_defaultStatement1132); 
            char_literal115_tree = 
            (Object)adaptor.create(char_literal115)
            ;
            adaptor.addChild(root_0, char_literal115_tree);


            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:156:21: ( statement )*
            loop25:
            do {
                int alt25=2;
                int LA25_0 = input.LA(1);

                if ( (LA25_0==BREAK||LA25_0==CHAR_LITERAL||LA25_0==CONTINUE||LA25_0==FLOAT_LITERAL||LA25_0==ID||LA25_0==INT_LITERAL||LA25_0==MULT||LA25_0==STRING_LITERAL||LA25_0==31||(LA25_0 >= 36 && LA25_0 <= 37)||(LA25_0 >= 40 && LA25_0 <= 41)||(LA25_0 >= 44 && LA25_0 <= 45)||LA25_0==52||LA25_0==62||(LA25_0 >= 65 && LA25_0 <= 66)||(LA25_0 >= 68 && LA25_0 <= 76)||(LA25_0 >= 80 && LA25_0 <= 81)||LA25_0==83||(LA25_0 >= 85 && LA25_0 <= 86)||LA25_0==89) ) {
                    alt25=1;
                }


                switch (alt25) {
            	case 1 :
            	    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:156:21: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_defaultStatement1134);
            	    statement116=statement();

            	    state._fsp--;

            	    adaptor.addChild(root_0, statement116.getTree());

            	    }
            	    break;

            	default :
            	    break loop25;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "defaultStatement"


    public static class forStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forStatement"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:159:1: forStatement : 'for' '(' ( forInit )? ';' ( expression )? ';' ( expression )? ')' statement ;
    public final forStatement_return forStatement() throws RecognitionException {
        forStatement_return retval = new forStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal117=null;
        Token char_literal118=null;
        Token char_literal120=null;
        Token char_literal122=null;
        Token char_literal124=null;
        forInit_return forInit119 =null;

        expression_return expression121 =null;

        expression_return expression123 =null;

        statement_return statement125 =null;


        Object string_literal117_tree=null;
        Object char_literal118_tree=null;
        Object char_literal120_tree=null;
        Object char_literal122_tree=null;
        Object char_literal124_tree=null;

        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:160:5: ( 'for' '(' ( forInit )? ';' ( expression )? ';' ( expression )? ')' statement )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:160:7: 'for' '(' ( forInit )? ';' ( expression )? ';' ( expression )? ')' statement
            {
            root_0 = (Object)adaptor.nil();


            string_literal117=(Token)match(input,69,FOLLOW_69_in_forStatement1152); 
            string_literal117_tree = 
            (Object)adaptor.create(string_literal117)
            ;
            adaptor.addChild(root_0, string_literal117_tree);


            char_literal118=(Token)match(input,37,FOLLOW_37_in_forStatement1154); 
            char_literal118_tree = 
            (Object)adaptor.create(char_literal118)
            ;
            adaptor.addChild(root_0, char_literal118_tree);


            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:160:17: ( forInit )?
            int alt26=2;
            int LA26_0 = input.LA(1);

            if ( (LA26_0==CHAR_LITERAL||LA26_0==FLOAT_LITERAL||LA26_0==ID||LA26_0==INT_LITERAL||LA26_0==MULT||LA26_0==STRING_LITERAL||LA26_0==31||(LA26_0 >= 36 && LA26_0 <= 37)||(LA26_0 >= 40 && LA26_0 <= 41)||(LA26_0 >= 44 && LA26_0 <= 45)||LA26_0==62||LA26_0==66||LA26_0==68||(LA26_0 >= 71 && LA26_0 <= 72)||(LA26_0 >= 75 && LA26_0 <= 76)||LA26_0==80||LA26_0==83||LA26_0==89) ) {
                alt26=1;
            }
            switch (alt26) {
                case 1 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:160:17: forInit
                    {
                    pushFollow(FOLLOW_forInit_in_forStatement1156);
                    forInit119=forInit();

                    state._fsp--;

                    adaptor.addChild(root_0, forInit119.getTree());

                    }
                    break;

            }


            char_literal120=(Token)match(input,52,FOLLOW_52_in_forStatement1159); 
            char_literal120_tree = 
            (Object)adaptor.create(char_literal120)
            ;
            adaptor.addChild(root_0, char_literal120_tree);


            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:160:30: ( expression )?
            int alt27=2;
            int LA27_0 = input.LA(1);

            if ( (LA27_0==CHAR_LITERAL||LA27_0==FLOAT_LITERAL||LA27_0==ID||LA27_0==INT_LITERAL||LA27_0==MULT||LA27_0==STRING_LITERAL||LA27_0==31||(LA27_0 >= 36 && LA27_0 <= 37)||(LA27_0 >= 40 && LA27_0 <= 41)||(LA27_0 >= 44 && LA27_0 <= 45)||LA27_0==89) ) {
                alt27=1;
            }
            switch (alt27) {
                case 1 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:160:30: expression
                    {
                    pushFollow(FOLLOW_expression_in_forStatement1161);
                    expression121=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression121.getTree());

                    }
                    break;

            }


            char_literal122=(Token)match(input,52,FOLLOW_52_in_forStatement1164); 
            char_literal122_tree = 
            (Object)adaptor.create(char_literal122)
            ;
            adaptor.addChild(root_0, char_literal122_tree);


            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:160:46: ( expression )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==CHAR_LITERAL||LA28_0==FLOAT_LITERAL||LA28_0==ID||LA28_0==INT_LITERAL||LA28_0==MULT||LA28_0==STRING_LITERAL||LA28_0==31||(LA28_0 >= 36 && LA28_0 <= 37)||(LA28_0 >= 40 && LA28_0 <= 41)||(LA28_0 >= 44 && LA28_0 <= 45)||LA28_0==89) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:160:46: expression
                    {
                    pushFollow(FOLLOW_expression_in_forStatement1166);
                    expression123=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression123.getTree());

                    }
                    break;

            }


            char_literal124=(Token)match(input,38,FOLLOW_38_in_forStatement1169); 
            char_literal124_tree = 
            (Object)adaptor.create(char_literal124)
            ;
            adaptor.addChild(root_0, char_literal124_tree);


            pushFollow(FOLLOW_statement_in_forStatement1171);
            statement125=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement125.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "forStatement"


    public static class forInit_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forInit"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:163:1: forInit : ( forVarDeclaration | expression -> ^( FOR_INIT expression ) );
    public final forInit_return forInit() throws RecognitionException {
        forInit_return retval = new forInit_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        forVarDeclaration_return forVarDeclaration126 =null;

        expression_return expression127 =null;


        RewriteRuleSubtreeStream stream_expression=new RewriteRuleSubtreeStream(adaptor,"rule expression");
        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:164:5: ( forVarDeclaration | expression -> ^( FOR_INIT expression ) )
            int alt29=2;
            int LA29_0 = input.LA(1);

            if ( (LA29_0==62||LA29_0==66||LA29_0==68||(LA29_0 >= 71 && LA29_0 <= 72)||(LA29_0 >= 75 && LA29_0 <= 76)||LA29_0==80||LA29_0==83) ) {
                alt29=1;
            }
            else if ( (LA29_0==CHAR_LITERAL||LA29_0==FLOAT_LITERAL||LA29_0==ID||LA29_0==INT_LITERAL||LA29_0==MULT||LA29_0==STRING_LITERAL||LA29_0==31||(LA29_0 >= 36 && LA29_0 <= 37)||(LA29_0 >= 40 && LA29_0 <= 41)||(LA29_0 >= 44 && LA29_0 <= 45)||LA29_0==89) ) {
                alt29=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 29, 0, input);

                throw nvae;

            }
            switch (alt29) {
                case 1 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:164:7: forVarDeclaration
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_forVarDeclaration_in_forInit1188);
                    forVarDeclaration126=forVarDeclaration();

                    state._fsp--;

                    adaptor.addChild(root_0, forVarDeclaration126.getTree());

                    }
                    break;
                case 2 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:165:7: expression
                    {
                    pushFollow(FOLLOW_expression_in_forInit1196);
                    expression127=expression();

                    state._fsp--;

                    stream_expression.add(expression127.getTree());

                    // AST REWRITE
                    // elements: expression
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 165:18: -> ^( FOR_INIT expression )
                    {
                        // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:165:21: ^( FOR_INIT expression )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(FOR_INIT, "FOR_INIT")
                        , root_1);

                        adaptor.addChild(root_1, stream_expression.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "forInit"


    public static class forVarDeclaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "forVarDeclaration"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:168:1: forVarDeclaration : dataType declarator ( '=' initializer )? ;
    public final forVarDeclaration_return forVarDeclaration() throws RecognitionException {
        forVarDeclaration_return retval = new forVarDeclaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal130=null;
        dataType_return dataType128 =null;

        declarator_return declarator129 =null;

        initializer_return initializer131 =null;


        Object char_literal130_tree=null;

        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:169:5: ( dataType declarator ( '=' initializer )? )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:169:7: dataType declarator ( '=' initializer )?
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_dataType_in_forVarDeclaration1221);
            dataType128=dataType();

            state._fsp--;

            adaptor.addChild(root_0, dataType128.getTree());

            pushFollow(FOLLOW_declarator_in_forVarDeclaration1223);
            declarator129=declarator();

            state._fsp--;

            adaptor.addChild(root_0, declarator129.getTree());

            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:169:27: ( '=' initializer )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( (LA30_0==55) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:169:28: '=' initializer
                    {
                    char_literal130=(Token)match(input,55,FOLLOW_55_in_forVarDeclaration1226); 
                    char_literal130_tree = 
                    (Object)adaptor.create(char_literal130)
                    ;
                    adaptor.addChild(root_0, char_literal130_tree);


                    pushFollow(FOLLOW_initializer_in_forVarDeclaration1228);
                    initializer131=initializer();

                    state._fsp--;

                    adaptor.addChild(root_0, initializer131.getTree());

                    }
                    break;

            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "forVarDeclaration"


    public static class whileStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "whileStatement"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:172:1: whileStatement : 'while' '(' expression ')' statement ;
    public final whileStatement_return whileStatement() throws RecognitionException {
        whileStatement_return retval = new whileStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal132=null;
        Token char_literal133=null;
        Token char_literal135=null;
        expression_return expression134 =null;

        statement_return statement136 =null;


        Object string_literal132_tree=null;
        Object char_literal133_tree=null;
        Object char_literal135_tree=null;

        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:173:5: ( 'while' '(' expression ')' statement )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:173:7: 'while' '(' expression ')' statement
            {
            root_0 = (Object)adaptor.nil();


            string_literal132=(Token)match(input,85,FOLLOW_85_in_whileStatement1247); 
            string_literal132_tree = 
            (Object)adaptor.create(string_literal132)
            ;
            adaptor.addChild(root_0, string_literal132_tree);


            char_literal133=(Token)match(input,37,FOLLOW_37_in_whileStatement1249); 
            char_literal133_tree = 
            (Object)adaptor.create(char_literal133)
            ;
            adaptor.addChild(root_0, char_literal133_tree);


            pushFollow(FOLLOW_expression_in_whileStatement1251);
            expression134=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression134.getTree());

            char_literal135=(Token)match(input,38,FOLLOW_38_in_whileStatement1253); 
            char_literal135_tree = 
            (Object)adaptor.create(char_literal135)
            ;
            adaptor.addChild(root_0, char_literal135_tree);


            pushFollow(FOLLOW_statement_in_whileStatement1255);
            statement136=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement136.getTree());

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "whileStatement"


    public static class doWhileStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "doWhileStatement"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:176:1: doWhileStatement : 'do' statement 'while' '(' expression ')' ';' ;
    public final doWhileStatement_return doWhileStatement() throws RecognitionException {
        doWhileStatement_return retval = new doWhileStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal137=null;
        Token string_literal139=null;
        Token char_literal140=null;
        Token char_literal142=null;
        Token char_literal143=null;
        statement_return statement138 =null;

        expression_return expression141 =null;


        Object string_literal137_tree=null;
        Object string_literal139_tree=null;
        Object char_literal140_tree=null;
        Object char_literal142_tree=null;
        Object char_literal143_tree=null;

        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:177:5: ( 'do' statement 'while' '(' expression ')' ';' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:177:7: 'do' statement 'while' '(' expression ')' ';'
            {
            root_0 = (Object)adaptor.nil();


            string_literal137=(Token)match(input,65,FOLLOW_65_in_doWhileStatement1272); 
            string_literal137_tree = 
            (Object)adaptor.create(string_literal137)
            ;
            adaptor.addChild(root_0, string_literal137_tree);


            pushFollow(FOLLOW_statement_in_doWhileStatement1274);
            statement138=statement();

            state._fsp--;

            adaptor.addChild(root_0, statement138.getTree());

            string_literal139=(Token)match(input,85,FOLLOW_85_in_doWhileStatement1276); 
            string_literal139_tree = 
            (Object)adaptor.create(string_literal139)
            ;
            adaptor.addChild(root_0, string_literal139_tree);


            char_literal140=(Token)match(input,37,FOLLOW_37_in_doWhileStatement1278); 
            char_literal140_tree = 
            (Object)adaptor.create(char_literal140)
            ;
            adaptor.addChild(root_0, char_literal140_tree);


            pushFollow(FOLLOW_expression_in_doWhileStatement1280);
            expression141=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression141.getTree());

            char_literal142=(Token)match(input,38,FOLLOW_38_in_doWhileStatement1282); 
            char_literal142_tree = 
            (Object)adaptor.create(char_literal142)
            ;
            adaptor.addChild(root_0, char_literal142_tree);


            char_literal143=(Token)match(input,52,FOLLOW_52_in_doWhileStatement1284); 
            char_literal143_tree = 
            (Object)adaptor.create(char_literal143)
            ;
            adaptor.addChild(root_0, char_literal143_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "doWhileStatement"


    public static class returnStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "returnStatement"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:180:1: returnStatement : 'return' ( expression )? ';' ;
    public final returnStatement_return returnStatement() throws RecognitionException {
        returnStatement_return retval = new returnStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal144=null;
        Token char_literal146=null;
        expression_return expression145 =null;


        Object string_literal144_tree=null;
        Object char_literal146_tree=null;

        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:181:5: ( 'return' ( expression )? ';' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:181:7: 'return' ( expression )? ';'
            {
            root_0 = (Object)adaptor.nil();


            string_literal144=(Token)match(input,74,FOLLOW_74_in_returnStatement1301); 
            string_literal144_tree = 
            (Object)adaptor.create(string_literal144)
            ;
            adaptor.addChild(root_0, string_literal144_tree);


            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:181:16: ( expression )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==CHAR_LITERAL||LA31_0==FLOAT_LITERAL||LA31_0==ID||LA31_0==INT_LITERAL||LA31_0==MULT||LA31_0==STRING_LITERAL||LA31_0==31||(LA31_0 >= 36 && LA31_0 <= 37)||(LA31_0 >= 40 && LA31_0 <= 41)||(LA31_0 >= 44 && LA31_0 <= 45)||LA31_0==89) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:181:16: expression
                    {
                    pushFollow(FOLLOW_expression_in_returnStatement1303);
                    expression145=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression145.getTree());

                    }
                    break;

            }


            char_literal146=(Token)match(input,52,FOLLOW_52_in_returnStatement1306); 
            char_literal146_tree = 
            (Object)adaptor.create(char_literal146)
            ;
            adaptor.addChild(root_0, char_literal146_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "returnStatement"


    public static class expressionStatement_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressionStatement"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:184:1: expressionStatement : ( expression )? ';' ;
    public final expressionStatement_return expressionStatement() throws RecognitionException {
        expressionStatement_return retval = new expressionStatement_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal148=null;
        expression_return expression147 =null;


        Object char_literal148_tree=null;

        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:185:5: ( ( expression )? ';' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:185:7: ( expression )? ';'
            {
            root_0 = (Object)adaptor.nil();


            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:185:7: ( expression )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==CHAR_LITERAL||LA32_0==FLOAT_LITERAL||LA32_0==ID||LA32_0==INT_LITERAL||LA32_0==MULT||LA32_0==STRING_LITERAL||LA32_0==31||(LA32_0 >= 36 && LA32_0 <= 37)||(LA32_0 >= 40 && LA32_0 <= 41)||(LA32_0 >= 44 && LA32_0 <= 45)||LA32_0==89) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:185:7: expression
                    {
                    pushFollow(FOLLOW_expression_in_expressionStatement1323);
                    expression147=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression147.getTree());

                    }
                    break;

            }


            char_literal148=(Token)match(input,52,FOLLOW_52_in_expressionStatement1326); 
            char_literal148_tree = 
            (Object)adaptor.create(char_literal148)
            ;
            adaptor.addChild(root_0, char_literal148_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expressionStatement"


    public static class expression_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expression"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:188:1: expression : term ( (op= ( '+' | '-' | compareOp | logicOp ) term )* ( assignmentOp ^ expression )? ) ;
    public final expression_return expression() throws RecognitionException {
        expression_return retval = new expression_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token op=null;
        Token char_literal150=null;
        Token char_literal151=null;
        term_return term149 =null;

        compareOp_return compareOp152 =null;

        logicOp_return logicOp153 =null;

        term_return term154 =null;

        assignmentOp_return assignmentOp155 =null;

        expression_return expression156 =null;


        Object op_tree=null;
        Object char_literal150_tree=null;
        Object char_literal151_tree=null;

        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:189:5: ( term ( (op= ( '+' | '-' | compareOp | logicOp ) term )* ( assignmentOp ^ expression )? ) )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:189:7: term ( (op= ( '+' | '-' | compareOp | logicOp ) term )* ( assignmentOp ^ expression )? )
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_term_in_expression1343);
            term149=term();

            state._fsp--;

            adaptor.addChild(root_0, term149.getTree());

            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:189:12: ( (op= ( '+' | '-' | compareOp | logicOp ) term )* ( assignmentOp ^ expression )? )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:189:13: (op= ( '+' | '-' | compareOp | logicOp ) term )* ( assignmentOp ^ expression )?
            {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:189:13: (op= ( '+' | '-' | compareOp | logicOp ) term )*
            loop34:
            do {
                int alt34=2;
                int LA34_0 = input.LA(1);

                if ( (LA34_0==32||LA34_0==35||LA34_0==40||LA34_0==44||(LA34_0 >= 53 && LA34_0 <= 54)||(LA34_0 >= 56 && LA34_0 <= 58)||LA34_0==87) ) {
                    alt34=1;
                }


                switch (alt34) {
            	case 1 :
            	    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:189:14: op= ( '+' | '-' | compareOp | logicOp ) term
            	    {
            	    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:189:17: ( '+' | '-' | compareOp | logicOp )
            	    int alt33=4;
            	    switch ( input.LA(1) ) {
            	    case 40:
            	        {
            	        alt33=1;
            	        }
            	        break;
            	    case 44:
            	        {
            	        alt33=2;
            	        }
            	        break;
            	    case 32:
            	    case 53:
            	    case 54:
            	    case 56:
            	    case 57:
            	    case 58:
            	        {
            	        alt33=3;
            	        }
            	        break;
            	    case 35:
            	    case 87:
            	        {
            	        alt33=4;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 33, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt33) {
            	        case 1 :
            	            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:189:18: '+'
            	            {
            	            char_literal150=(Token)match(input,40,FOLLOW_40_in_expression1350); 
            	            char_literal150_tree = 
            	            (Object)adaptor.create(char_literal150)
            	            ;
            	            adaptor.addChild(root_0, char_literal150_tree);


            	            }
            	            break;
            	        case 2 :
            	            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:189:22: '-'
            	            {
            	            char_literal151=(Token)match(input,44,FOLLOW_44_in_expression1352); 
            	            char_literal151_tree = 
            	            (Object)adaptor.create(char_literal151)
            	            ;
            	            adaptor.addChild(root_0, char_literal151_tree);


            	            }
            	            break;
            	        case 3 :
            	            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:189:26: compareOp
            	            {
            	            pushFollow(FOLLOW_compareOp_in_expression1354);
            	            compareOp152=compareOp();

            	            state._fsp--;

            	            adaptor.addChild(root_0, compareOp152.getTree());

            	            }
            	            break;
            	        case 4 :
            	            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:189:36: logicOp
            	            {
            	            pushFollow(FOLLOW_logicOp_in_expression1356);
            	            logicOp153=logicOp();

            	            state._fsp--;

            	            adaptor.addChild(root_0, logicOp153.getTree());

            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_term_in_expression1359);
            	    term154=term();

            	    state._fsp--;

            	    adaptor.addChild(root_0, term154.getTree());

            	    }
            	    break;

            	default :
            	    break loop34;
                }
            } while (true);


            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:189:52: ( assignmentOp ^ expression )?
            int alt35=2;
            int LA35_0 = input.LA(1);

            if ( (LA35_0==34||LA35_0==39||LA35_0==42||LA35_0==46||LA35_0==50||LA35_0==55) ) {
                alt35=1;
            }
            switch (alt35) {
                case 1 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:189:53: assignmentOp ^ expression
                    {
                    pushFollow(FOLLOW_assignmentOp_in_expression1364);
                    assignmentOp155=assignmentOp();

                    state._fsp--;

                    root_0 = (Object)adaptor.becomeRoot(assignmentOp155.getTree(), root_0);

                    pushFollow(FOLLOW_expression_in_expression1367);
                    expression156=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression156.getTree());

                    }
                    break;

            }


            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expression"


    public static class compareOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "compareOp"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:192:1: compareOp : ( '==' | '!=' | '<' | '>' | '<=' | '>=' );
    public final compareOp_return compareOp() throws RecognitionException {
        compareOp_return retval = new compareOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set157=null;

        Object set157_tree=null;

        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:193:5: ( '==' | '!=' | '<' | '>' | '<=' | '>=' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:
            {
            root_0 = (Object)adaptor.nil();


            set157=(Token)input.LT(1);

            if ( input.LA(1)==32||(input.LA(1) >= 53 && input.LA(1) <= 54)||(input.LA(1) >= 56 && input.LA(1) <= 58) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set157)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "compareOp"


    public static class logicOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "logicOp"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:196:1: logicOp : ( '&&' | '||' );
    public final logicOp_return logicOp() throws RecognitionException {
        logicOp_return retval = new logicOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set158=null;

        Object set158_tree=null;

        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:197:5: ( '&&' | '||' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:
            {
            root_0 = (Object)adaptor.nil();


            set158=(Token)input.LT(1);

            if ( input.LA(1)==35||input.LA(1)==87 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set158)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "logicOp"


    public static class assignmentOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "assignmentOp"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:200:1: assignmentOp : ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' );
    public final assignmentOp_return assignmentOp() throws RecognitionException {
        assignmentOp_return retval = new assignmentOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set159=null;

        Object set159_tree=null;

        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:201:5: ( '=' | '+=' | '-=' | '*=' | '/=' | '%=' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:
            {
            root_0 = (Object)adaptor.nil();


            set159=(Token)input.LT(1);

            if ( input.LA(1)==34||input.LA(1)==39||input.LA(1)==42||input.LA(1)==46||input.LA(1)==50||input.LA(1)==55 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set159)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "assignmentOp"


    public static class term_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "term"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:204:1: term : factor ( ( MULT ^| DIV ^| MOD ^) factor )* ;
    public final term_return term() throws RecognitionException {
        term_return retval = new term_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token MULT161=null;
        Token DIV162=null;
        Token MOD163=null;
        factor_return factor160 =null;

        factor_return factor164 =null;


        Object MULT161_tree=null;
        Object DIV162_tree=null;
        Object MOD163_tree=null;

        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:205:5: ( factor ( ( MULT ^| DIV ^| MOD ^) factor )* )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:205:7: factor ( ( MULT ^| DIV ^| MOD ^) factor )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_factor_in_term1482);
            factor160=factor();

            state._fsp--;

            adaptor.addChild(root_0, factor160.getTree());

            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:205:14: ( ( MULT ^| DIV ^| MOD ^) factor )*
            loop37:
            do {
                int alt37=2;
                int LA37_0 = input.LA(1);

                if ( (LA37_0==DIV||(LA37_0 >= MOD && LA37_0 <= MULT)) ) {
                    alt37=1;
                }


                switch (alt37) {
            	case 1 :
            	    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:205:15: ( MULT ^| DIV ^| MOD ^) factor
            	    {
            	    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:205:15: ( MULT ^| DIV ^| MOD ^)
            	    int alt36=3;
            	    switch ( input.LA(1) ) {
            	    case MULT:
            	        {
            	        alt36=1;
            	        }
            	        break;
            	    case DIV:
            	        {
            	        alt36=2;
            	        }
            	        break;
            	    case MOD:
            	        {
            	        alt36=3;
            	        }
            	        break;
            	    default:
            	        NoViableAltException nvae =
            	            new NoViableAltException("", 36, 0, input);

            	        throw nvae;

            	    }

            	    switch (alt36) {
            	        case 1 :
            	            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:205:16: MULT ^
            	            {
            	            MULT161=(Token)match(input,MULT,FOLLOW_MULT_in_term1486); 
            	            MULT161_tree = 
            	            (Object)adaptor.create(MULT161)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(MULT161_tree, root_0);


            	            }
            	            break;
            	        case 2 :
            	            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:205:24: DIV ^
            	            {
            	            DIV162=(Token)match(input,DIV,FOLLOW_DIV_in_term1491); 
            	            DIV162_tree = 
            	            (Object)adaptor.create(DIV162)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(DIV162_tree, root_0);


            	            }
            	            break;
            	        case 3 :
            	            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:205:31: MOD ^
            	            {
            	            MOD163=(Token)match(input,MOD,FOLLOW_MOD_in_term1496); 
            	            MOD163_tree = 
            	            (Object)adaptor.create(MOD163)
            	            ;
            	            root_0 = (Object)adaptor.becomeRoot(MOD163_tree, root_0);


            	            }
            	            break;

            	    }


            	    pushFollow(FOLLOW_factor_in_term1500);
            	    factor164=factor();

            	    state._fsp--;

            	    adaptor.addChild(root_0, factor164.getTree());

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "term"


    public static class factor_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "factor"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:208:1: factor : ( prefixOp ^)* value ( postfixOp )* ;
    public final factor_return factor() throws RecognitionException {
        factor_return retval = new factor_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        prefixOp_return prefixOp165 =null;

        value_return value166 =null;

        postfixOp_return postfixOp167 =null;



        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:209:5: ( ( prefixOp ^)* value ( postfixOp )* )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:209:7: ( prefixOp ^)* value ( postfixOp )*
            {
            root_0 = (Object)adaptor.nil();


            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:209:7: ( prefixOp ^)*
            loop38:
            do {
                int alt38=2;
                int LA38_0 = input.LA(1);

                if ( (LA38_0==MULT||LA38_0==31||LA38_0==36||(LA38_0 >= 40 && LA38_0 <= 41)||(LA38_0 >= 44 && LA38_0 <= 45)||LA38_0==89) ) {
                    alt38=1;
                }


                switch (alt38) {
            	case 1 :
            	    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:209:8: prefixOp ^
            	    {
            	    pushFollow(FOLLOW_prefixOp_in_factor1520);
            	    prefixOp165=prefixOp();

            	    state._fsp--;

            	    root_0 = (Object)adaptor.becomeRoot(prefixOp165.getTree(), root_0);

            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);


            pushFollow(FOLLOW_value_in_factor1525);
            value166=value();

            state._fsp--;

            adaptor.addChild(root_0, value166.getTree());

            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:209:26: ( postfixOp )*
            loop39:
            do {
                int alt39=2;
                int LA39_0 = input.LA(1);

                if ( (LA39_0==37||LA39_0==41||LA39_0==45||(LA39_0 >= 47 && LA39_0 <= 48)||LA39_0==59) ) {
                    alt39=1;
                }


                switch (alt39) {
            	case 1 :
            	    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:209:26: postfixOp
            	    {
            	    pushFollow(FOLLOW_postfixOp_in_factor1527);
            	    postfixOp167=postfixOp();

            	    state._fsp--;

            	    adaptor.addChild(root_0, postfixOp167.getTree());

            	    }
            	    break;

            	default :
            	    break loop39;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "factor"


    public static class prefixOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prefixOp"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:212:1: prefixOp : ( '!' | '~' | '+' | '-' | '++' | '--' | '&' | '*' );
    public final prefixOp_return prefixOp() throws RecognitionException {
        prefixOp_return retval = new prefixOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set168=null;

        Object set168_tree=null;

        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:213:5: ( '!' | '~' | '+' | '-' | '++' | '--' | '&' | '*' )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:
            {
            root_0 = (Object)adaptor.nil();


            set168=(Token)input.LT(1);

            if ( input.LA(1)==MULT||input.LA(1)==31||input.LA(1)==36||(input.LA(1) >= 40 && input.LA(1) <= 41)||(input.LA(1) >= 44 && input.LA(1) <= 45)||input.LA(1)==89 ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set168)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prefixOp"


    public static class postfixOp_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "postfixOp"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:216:1: postfixOp : ( '++' | '--' | '[' expression ']' | '(' ( expressionList )? ')' | '.' ID | '->' ID );
    public final postfixOp_return postfixOp() throws RecognitionException {
        postfixOp_return retval = new postfixOp_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal169=null;
        Token string_literal170=null;
        Token char_literal171=null;
        Token char_literal173=null;
        Token char_literal174=null;
        Token char_literal176=null;
        Token char_literal177=null;
        Token ID178=null;
        Token string_literal179=null;
        Token ID180=null;
        expression_return expression172 =null;

        expressionList_return expressionList175 =null;


        Object string_literal169_tree=null;
        Object string_literal170_tree=null;
        Object char_literal171_tree=null;
        Object char_literal173_tree=null;
        Object char_literal174_tree=null;
        Object char_literal176_tree=null;
        Object char_literal177_tree=null;
        Object ID178_tree=null;
        Object string_literal179_tree=null;
        Object ID180_tree=null;

        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:217:5: ( '++' | '--' | '[' expression ']' | '(' ( expressionList )? ')' | '.' ID | '->' ID )
            int alt41=6;
            switch ( input.LA(1) ) {
            case 41:
                {
                alt41=1;
                }
                break;
            case 45:
                {
                alt41=2;
                }
                break;
            case 59:
                {
                alt41=3;
                }
                break;
            case 37:
                {
                alt41=4;
                }
                break;
            case 48:
                {
                alt41=5;
                }
                break;
            case 47:
                {
                alt41=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 41, 0, input);

                throw nvae;

            }

            switch (alt41) {
                case 1 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:217:7: '++'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal169=(Token)match(input,41,FOLLOW_41_in_postfixOp1590); 
                    string_literal169_tree = 
                    (Object)adaptor.create(string_literal169)
                    ;
                    adaptor.addChild(root_0, string_literal169_tree);


                    }
                    break;
                case 2 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:218:7: '--'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal170=(Token)match(input,45,FOLLOW_45_in_postfixOp1598); 
                    string_literal170_tree = 
                    (Object)adaptor.create(string_literal170)
                    ;
                    adaptor.addChild(root_0, string_literal170_tree);


                    }
                    break;
                case 3 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:219:7: '[' expression ']'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal171=(Token)match(input,59,FOLLOW_59_in_postfixOp1606); 
                    char_literal171_tree = 
                    (Object)adaptor.create(char_literal171)
                    ;
                    adaptor.addChild(root_0, char_literal171_tree);


                    pushFollow(FOLLOW_expression_in_postfixOp1608);
                    expression172=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression172.getTree());

                    char_literal173=(Token)match(input,60,FOLLOW_60_in_postfixOp1610); 
                    char_literal173_tree = 
                    (Object)adaptor.create(char_literal173)
                    ;
                    adaptor.addChild(root_0, char_literal173_tree);


                    }
                    break;
                case 4 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:220:7: '(' ( expressionList )? ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal174=(Token)match(input,37,FOLLOW_37_in_postfixOp1618); 
                    char_literal174_tree = 
                    (Object)adaptor.create(char_literal174)
                    ;
                    adaptor.addChild(root_0, char_literal174_tree);


                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:220:11: ( expressionList )?
                    int alt40=2;
                    int LA40_0 = input.LA(1);

                    if ( (LA40_0==CHAR_LITERAL||LA40_0==FLOAT_LITERAL||LA40_0==ID||LA40_0==INT_LITERAL||LA40_0==MULT||LA40_0==STRING_LITERAL||LA40_0==31||(LA40_0 >= 36 && LA40_0 <= 37)||(LA40_0 >= 40 && LA40_0 <= 41)||(LA40_0 >= 44 && LA40_0 <= 45)||LA40_0==89) ) {
                        alt40=1;
                    }
                    switch (alt40) {
                        case 1 :
                            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:220:11: expressionList
                            {
                            pushFollow(FOLLOW_expressionList_in_postfixOp1620);
                            expressionList175=expressionList();

                            state._fsp--;

                            adaptor.addChild(root_0, expressionList175.getTree());

                            }
                            break;

                    }


                    char_literal176=(Token)match(input,38,FOLLOW_38_in_postfixOp1623); 
                    char_literal176_tree = 
                    (Object)adaptor.create(char_literal176)
                    ;
                    adaptor.addChild(root_0, char_literal176_tree);


                    }
                    break;
                case 5 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:221:7: '.' ID
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal177=(Token)match(input,48,FOLLOW_48_in_postfixOp1631); 
                    char_literal177_tree = 
                    (Object)adaptor.create(char_literal177)
                    ;
                    adaptor.addChild(root_0, char_literal177_tree);


                    ID178=(Token)match(input,ID,FOLLOW_ID_in_postfixOp1633); 
                    ID178_tree = 
                    (Object)adaptor.create(ID178)
                    ;
                    adaptor.addChild(root_0, ID178_tree);


                    }
                    break;
                case 6 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:222:7: '->' ID
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal179=(Token)match(input,47,FOLLOW_47_in_postfixOp1641); 
                    string_literal179_tree = 
                    (Object)adaptor.create(string_literal179)
                    ;
                    adaptor.addChild(root_0, string_literal179_tree);


                    ID180=(Token)match(input,ID,FOLLOW_ID_in_postfixOp1643); 
                    ID180_tree = 
                    (Object)adaptor.create(ID180)
                    ;
                    adaptor.addChild(root_0, ID180_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "postfixOp"


    public static class value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "value"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:225:1: value : ( ID | INT_LITERAL | FLOAT_LITERAL | STRING_LITERAL | CHAR_LITERAL | '(' expression ')' );
    public final value_return value() throws RecognitionException {
        value_return retval = new value_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID181=null;
        Token INT_LITERAL182=null;
        Token FLOAT_LITERAL183=null;
        Token STRING_LITERAL184=null;
        Token CHAR_LITERAL185=null;
        Token char_literal186=null;
        Token char_literal188=null;
        expression_return expression187 =null;


        Object ID181_tree=null;
        Object INT_LITERAL182_tree=null;
        Object FLOAT_LITERAL183_tree=null;
        Object STRING_LITERAL184_tree=null;
        Object CHAR_LITERAL185_tree=null;
        Object char_literal186_tree=null;
        Object char_literal188_tree=null;

        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:226:5: ( ID | INT_LITERAL | FLOAT_LITERAL | STRING_LITERAL | CHAR_LITERAL | '(' expression ')' )
            int alt42=6;
            switch ( input.LA(1) ) {
            case ID:
                {
                alt42=1;
                }
                break;
            case INT_LITERAL:
                {
                alt42=2;
                }
                break;
            case FLOAT_LITERAL:
                {
                alt42=3;
                }
                break;
            case STRING_LITERAL:
                {
                alt42=4;
                }
                break;
            case CHAR_LITERAL:
                {
                alt42=5;
                }
                break;
            case 37:
                {
                alt42=6;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 42, 0, input);

                throw nvae;

            }

            switch (alt42) {
                case 1 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:226:7: ID
                    {
                    root_0 = (Object)adaptor.nil();


                    ID181=(Token)match(input,ID,FOLLOW_ID_in_value1660); 
                    ID181_tree = 
                    (Object)adaptor.create(ID181)
                    ;
                    adaptor.addChild(root_0, ID181_tree);


                    }
                    break;
                case 2 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:227:7: INT_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    INT_LITERAL182=(Token)match(input,INT_LITERAL,FOLLOW_INT_LITERAL_in_value1668); 
                    INT_LITERAL182_tree = 
                    (Object)adaptor.create(INT_LITERAL182)
                    ;
                    adaptor.addChild(root_0, INT_LITERAL182_tree);


                    }
                    break;
                case 3 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:228:7: FLOAT_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    FLOAT_LITERAL183=(Token)match(input,FLOAT_LITERAL,FOLLOW_FLOAT_LITERAL_in_value1676); 
                    FLOAT_LITERAL183_tree = 
                    (Object)adaptor.create(FLOAT_LITERAL183)
                    ;
                    adaptor.addChild(root_0, FLOAT_LITERAL183_tree);


                    }
                    break;
                case 4 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:229:7: STRING_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    STRING_LITERAL184=(Token)match(input,STRING_LITERAL,FOLLOW_STRING_LITERAL_in_value1684); 
                    STRING_LITERAL184_tree = 
                    (Object)adaptor.create(STRING_LITERAL184)
                    ;
                    adaptor.addChild(root_0, STRING_LITERAL184_tree);


                    }
                    break;
                case 5 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:230:7: CHAR_LITERAL
                    {
                    root_0 = (Object)adaptor.nil();


                    CHAR_LITERAL185=(Token)match(input,CHAR_LITERAL,FOLLOW_CHAR_LITERAL_in_value1692); 
                    CHAR_LITERAL185_tree = 
                    (Object)adaptor.create(CHAR_LITERAL185)
                    ;
                    adaptor.addChild(root_0, CHAR_LITERAL185_tree);


                    }
                    break;
                case 6 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:231:7: '(' expression ')'
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal186=(Token)match(input,37,FOLLOW_37_in_value1700); 
                    char_literal186_tree = 
                    (Object)adaptor.create(char_literal186)
                    ;
                    adaptor.addChild(root_0, char_literal186_tree);


                    pushFollow(FOLLOW_expression_in_value1702);
                    expression187=expression();

                    state._fsp--;

                    adaptor.addChild(root_0, expression187.getTree());

                    char_literal188=(Token)match(input,38,FOLLOW_38_in_value1704); 
                    char_literal188_tree = 
                    (Object)adaptor.create(char_literal188)
                    ;
                    adaptor.addChild(root_0, char_literal188_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "value"


    public static class expressionList_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expressionList"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:234:1: expressionList : expression ( ',' expression )* ;
    public final expressionList_return expressionList() throws RecognitionException {
        expressionList_return retval = new expressionList_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal190=null;
        expression_return expression189 =null;

        expression_return expression191 =null;


        Object char_literal190_tree=null;

        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:235:5: ( expression ( ',' expression )* )
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:235:7: expression ( ',' expression )*
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_expression_in_expressionList1722);
            expression189=expression();

            state._fsp--;

            adaptor.addChild(root_0, expression189.getTree());

            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:235:18: ( ',' expression )*
            loop43:
            do {
                int alt43=2;
                int LA43_0 = input.LA(1);

                if ( (LA43_0==43) ) {
                    alt43=1;
                }


                switch (alt43) {
            	case 1 :
            	    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:235:19: ',' expression
            	    {
            	    char_literal190=(Token)match(input,43,FOLLOW_43_in_expressionList1725); 
            	    char_literal190_tree = 
            	    (Object)adaptor.create(char_literal190)
            	    ;
            	    adaptor.addChild(root_0, char_literal190_tree);


            	    pushFollow(FOLLOW_expression_in_expressionList1727);
            	    expression191=expression();

            	    state._fsp--;

            	    adaptor.addChild(root_0, expression191.getTree());

            	    }
            	    break;

            	default :
            	    break loop43;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expressionList"


    public static class dataType_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "dataType"
    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:238:1: dataType : ( 'int' | 'char' | 'float' | 'double' | 'long' | 'short' | 'unsigned' | 'signed' | 'struct' ID );
    public final dataType_return dataType() throws RecognitionException {
        dataType_return retval = new dataType_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token string_literal192=null;
        Token string_literal193=null;
        Token string_literal194=null;
        Token string_literal195=null;
        Token string_literal196=null;
        Token string_literal197=null;
        Token string_literal198=null;
        Token string_literal199=null;
        Token string_literal200=null;
        Token ID201=null;

        Object string_literal192_tree=null;
        Object string_literal193_tree=null;
        Object string_literal194_tree=null;
        Object string_literal195_tree=null;
        Object string_literal196_tree=null;
        Object string_literal197_tree=null;
        Object string_literal198_tree=null;
        Object string_literal199_tree=null;
        Object string_literal200_tree=null;
        Object ID201_tree=null;

        try {
            // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:239:5: ( 'int' | 'char' | 'float' | 'double' | 'long' | 'short' | 'unsigned' | 'signed' | 'struct' ID )
            int alt44=9;
            switch ( input.LA(1) ) {
            case 71:
                {
                alt44=1;
                }
                break;
            case 62:
                {
                alt44=2;
                }
                break;
            case 68:
                {
                alt44=3;
                }
                break;
            case 66:
                {
                alt44=4;
                }
                break;
            case 72:
                {
                alt44=5;
                }
                break;
            case 75:
                {
                alt44=6;
                }
                break;
            case 83:
                {
                alt44=7;
                }
                break;
            case 76:
                {
                alt44=8;
                }
                break;
            case 80:
                {
                alt44=9;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 44, 0, input);

                throw nvae;

            }

            switch (alt44) {
                case 1 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:239:7: 'int'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal192=(Token)match(input,71,FOLLOW_71_in_dataType1746); 
                    string_literal192_tree = 
                    (Object)adaptor.create(string_literal192)
                    ;
                    adaptor.addChild(root_0, string_literal192_tree);


                    }
                    break;
                case 2 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:240:7: 'char'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal193=(Token)match(input,62,FOLLOW_62_in_dataType1754); 
                    string_literal193_tree = 
                    (Object)adaptor.create(string_literal193)
                    ;
                    adaptor.addChild(root_0, string_literal193_tree);


                    }
                    break;
                case 3 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:241:7: 'float'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal194=(Token)match(input,68,FOLLOW_68_in_dataType1762); 
                    string_literal194_tree = 
                    (Object)adaptor.create(string_literal194)
                    ;
                    adaptor.addChild(root_0, string_literal194_tree);


                    }
                    break;
                case 4 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:242:7: 'double'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal195=(Token)match(input,66,FOLLOW_66_in_dataType1770); 
                    string_literal195_tree = 
                    (Object)adaptor.create(string_literal195)
                    ;
                    adaptor.addChild(root_0, string_literal195_tree);


                    }
                    break;
                case 5 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:243:7: 'long'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal196=(Token)match(input,72,FOLLOW_72_in_dataType1778); 
                    string_literal196_tree = 
                    (Object)adaptor.create(string_literal196)
                    ;
                    adaptor.addChild(root_0, string_literal196_tree);


                    }
                    break;
                case 6 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:244:7: 'short'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal197=(Token)match(input,75,FOLLOW_75_in_dataType1786); 
                    string_literal197_tree = 
                    (Object)adaptor.create(string_literal197)
                    ;
                    adaptor.addChild(root_0, string_literal197_tree);


                    }
                    break;
                case 7 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:245:7: 'unsigned'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal198=(Token)match(input,83,FOLLOW_83_in_dataType1794); 
                    string_literal198_tree = 
                    (Object)adaptor.create(string_literal198)
                    ;
                    adaptor.addChild(root_0, string_literal198_tree);


                    }
                    break;
                case 8 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:246:7: 'signed'
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal199=(Token)match(input,76,FOLLOW_76_in_dataType1802); 
                    string_literal199_tree = 
                    (Object)adaptor.create(string_literal199)
                    ;
                    adaptor.addChild(root_0, string_literal199_tree);


                    }
                    break;
                case 9 :
                    // N:\\Study\\Material\\CS407\\Practical\\Projects\\Project 1\\New\\Project_AST.g:247:7: 'struct' ID
                    {
                    root_0 = (Object)adaptor.nil();


                    string_literal200=(Token)match(input,80,FOLLOW_80_in_dataType1810); 
                    string_literal200_tree = 
                    (Object)adaptor.create(string_literal200)
                    ;
                    adaptor.addChild(root_0, string_literal200_tree);


                    ID201=(Token)match(input,ID,FOLLOW_ID_in_dataType1812); 
                    ID201_tree = 
                    (Object)adaptor.create(ID201)
                    ;
                    adaptor.addChild(root_0, ID201_tree);


                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "dataType"

    // Delegated rules


 

    public static final BitSet FOLLOW_includeDirectives_in_program143 = new BitSet(new long[]{0x4000000000000000L,0x0000000000191994L});
    public static final BitSet FOLLOW_globalDeclarations_in_program145 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_includeDirective_in_includeDirectives205 = new BitSet(new long[]{0x0000000200000002L});
    public static final BitSet FOLLOW_33_in_includeDirective232 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_includeDirective234 = new BitSet(new long[]{0x8000000000010000L,0x000000000004E000L});
    public static final BitSet FOLLOW_libraryName_in_includeDirective236 = new BitSet(new long[]{0x0200000000000000L});
    public static final BitSet FOLLOW_57_in_includeDirective238 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_77_in_libraryName263 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_79_in_libraryName271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_63_in_libraryName279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_78_in_libraryName287 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_82_in_libraryName295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_libraryName303 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_libraryName305 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_structDefinition_in_globalDeclarations323 = new BitSet(new long[]{0x4000000000000002L,0x0000000000191994L});
    public static final BitSet FOLLOW_globalVariableDeclaration_in_globalDeclarations327 = new BitSet(new long[]{0x4000000000000002L,0x0000000000191994L});
    public static final BitSet FOLLOW_functionDefinition_in_globalDeclarations331 = new BitSet(new long[]{0x4000000000000002L,0x0000000000191994L});
    public static final BitSet FOLLOW_80_in_structDefinition365 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_structDefinition367 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_structDefinition369 = new BitSet(new long[]{0x4000000000000000L,0x0000000000091994L});
    public static final BitSet FOLLOW_structMembers_in_structDefinition371 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_structDefinition373 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_structDefinition375 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDeclaration_in_structMembers403 = new BitSet(new long[]{0x4000000000000002L,0x0000000000091994L});
    public static final BitSet FOLLOW_dataType_in_variableDeclaration431 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_declarator_in_variableDeclaration433 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_variableDeclaration435 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_declarator462 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_declarator470 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_declarator472 = new BitSet(new long[]{0x1000000000090000L});
    public static final BitSet FOLLOW_constantExpression_in_declarator474 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_declarator477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_MULT_in_declarator485 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_declarator487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dataType_in_globalVariableDeclaration529 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_declarator_in_globalVariableDeclaration531 = new BitSet(new long[]{0x0090000000000000L});
    public static final BitSet FOLLOW_55_in_globalVariableDeclaration534 = new BitSet(new long[]{0x0000333082491100L,0x0000000002400000L});
    public static final BitSet FOLLOW_initializer_in_globalVariableDeclaration536 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_globalVariableDeclaration540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_initializer570 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_arrayInitializer_in_initializer578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_arrayInitializer595 = new BitSet(new long[]{0x0000333082491100L,0x0000000003400000L});
    public static final BitSet FOLLOW_initializerList_in_arrayInitializer597 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_arrayInitializer600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_initializer_in_initializerList626 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_initializerList629 = new BitSet(new long[]{0x0000333082491100L,0x0000000002400000L});
    public static final BitSet FOLLOW_initializer_in_initializerList631 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_dataType_in_functionDefinition662 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_84_in_functionDefinition666 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_functionDefinition669 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_functionDefinition671 = new BitSet(new long[]{0x4000004000000000L,0x0000000000091994L});
    public static final BitSet FOLLOW_parameterList_in_functionDefinition673 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_functionDefinition676 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_compoundStatement_in_functionDefinition678 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_parameter_in_parameterList719 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_parameterList722 = new BitSet(new long[]{0x4000000000000000L,0x0000000000091994L});
    public static final BitSet FOLLOW_parameter_in_parameterList724 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_dataType_in_parameter752 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_parameter754 = new BitSet(new long[]{0x0800000000000002L});
    public static final BitSet FOLLOW_59_in_parameter757 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_parameter759 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dataType_in_parameter769 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_MULT_in_parameter771 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_parameter773 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_86_in_compoundStatement790 = new BitSet(new long[]{0x4010333082491540L,0x00000000036B1FF6L});
    public static final BitSet FOLLOW_statement_in_compoundStatement792 = new BitSet(new long[]{0x4010333082491540L,0x00000000036B1FF6L});
    public static final BitSet FOLLOW_88_in_compoundStatement795 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compoundStatement_in_statement821 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_localVariableDeclaration_in_statement829 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement837 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_switchStatement_in_statement845 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forStatement_in_statement853 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_doWhileStatement_in_statement869 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_returnStatement_in_statement877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_printStatement_in_statement885 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BREAK_in_statement893 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_statement895 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CONTINUE_in_statement903 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_statement905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expressionStatement_in_statement913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_73_in_printStatement930 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_printStatement932 = new BitSet(new long[]{0x0000084002000000L});
    public static final BitSet FOLLOW_stringArg_in_printStatement934 = new BitSet(new long[]{0x0000084000000000L});
    public static final BitSet FOLLOW_43_in_printStatement938 = new BitSet(new long[]{0x0000333082491100L,0x0000000002000000L});
    public static final BitSet FOLLOW_expression_in_printStatement940 = new BitSet(new long[]{0x0000084000000000L});
    public static final BitSet FOLLOW_38_in_printStatement944 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_printStatement946 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_stringArg963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dataType_in_localVariableDeclaration980 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_declarator_in_localVariableDeclaration982 = new BitSet(new long[]{0x0090000000000000L});
    public static final BitSet FOLLOW_55_in_localVariableDeclaration985 = new BitSet(new long[]{0x0000333082491100L,0x0000000002400000L});
    public static final BitSet FOLLOW_initializer_in_localVariableDeclaration987 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_localVariableDeclaration991 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_70_in_ifStatement1021 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_ifStatement1023 = new BitSet(new long[]{0x0000333082491100L,0x0000000002000000L});
    public static final BitSet FOLLOW_expression_in_ifStatement1025 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_ifStatement1027 = new BitSet(new long[]{0x4010333082491540L,0x00000000026B1FF6L});
    public static final BitSet FOLLOW_statement_in_ifStatement1029 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000008L});
    public static final BitSet FOLLOW_67_in_ifStatement1041 = new BitSet(new long[]{0x4010333082491540L,0x00000000026B1FF6L});
    public static final BitSet FOLLOW_statement_in_ifStatement1043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_81_in_switchStatement1062 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_switchStatement1064 = new BitSet(new long[]{0x0000333082491100L,0x0000000002000000L});
    public static final BitSet FOLLOW_expression_in_switchStatement1066 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_switchStatement1068 = new BitSet(new long[]{0x0000000000000000L,0x0000000000400000L});
    public static final BitSet FOLLOW_86_in_switchStatement1070 = new BitSet(new long[]{0x2000000000000000L,0x0000000001000001L});
    public static final BitSet FOLLOW_caseStatement_in_switchStatement1072 = new BitSet(new long[]{0x2000000000000000L,0x0000000001000001L});
    public static final BitSet FOLLOW_defaultStatement_in_switchStatement1075 = new BitSet(new long[]{0x0000000000000000L,0x0000000001000000L});
    public static final BitSet FOLLOW_88_in_switchStatement1078 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_61_in_caseStatement1095 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_INT_LITERAL_in_caseStatement1097 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_caseStatement1099 = new BitSet(new long[]{0x4010333082491542L,0x00000000026B1FF6L});
    public static final BitSet FOLLOW_statement_in_caseStatement1101 = new BitSet(new long[]{0x4010333082491542L,0x00000000026B1FF6L});
    public static final BitSet FOLLOW_64_in_defaultStatement1130 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_defaultStatement1132 = new BitSet(new long[]{0x4010333082491542L,0x00000000026B1FF6L});
    public static final BitSet FOLLOW_statement_in_defaultStatement1134 = new BitSet(new long[]{0x4010333082491542L,0x00000000026B1FF6L});
    public static final BitSet FOLLOW_69_in_forStatement1152 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_forStatement1154 = new BitSet(new long[]{0x4010333082491100L,0x0000000002091994L});
    public static final BitSet FOLLOW_forInit_in_forStatement1156 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_forStatement1159 = new BitSet(new long[]{0x0010333082491100L,0x0000000002000000L});
    public static final BitSet FOLLOW_expression_in_forStatement1161 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_forStatement1164 = new BitSet(new long[]{0x0000337082491100L,0x0000000002000000L});
    public static final BitSet FOLLOW_expression_in_forStatement1166 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_forStatement1169 = new BitSet(new long[]{0x4010333082491540L,0x00000000026B1FF6L});
    public static final BitSet FOLLOW_statement_in_forStatement1171 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_forVarDeclaration_in_forInit1188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_forInit1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_dataType_in_forVarDeclaration1221 = new BitSet(new long[]{0x0000000000410000L});
    public static final BitSet FOLLOW_declarator_in_forVarDeclaration1223 = new BitSet(new long[]{0x0080000000000002L});
    public static final BitSet FOLLOW_55_in_forVarDeclaration1226 = new BitSet(new long[]{0x0000333082491100L,0x0000000002400000L});
    public static final BitSet FOLLOW_initializer_in_forVarDeclaration1228 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_85_in_whileStatement1247 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_whileStatement1249 = new BitSet(new long[]{0x0000333082491100L,0x0000000002000000L});
    public static final BitSet FOLLOW_expression_in_whileStatement1251 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_whileStatement1253 = new BitSet(new long[]{0x4010333082491540L,0x00000000026B1FF6L});
    public static final BitSet FOLLOW_statement_in_whileStatement1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_65_in_doWhileStatement1272 = new BitSet(new long[]{0x4010333082491540L,0x00000000026B1FF6L});
    public static final BitSet FOLLOW_statement_in_doWhileStatement1274 = new BitSet(new long[]{0x0000000000000000L,0x0000000000200000L});
    public static final BitSet FOLLOW_85_in_doWhileStatement1276 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_doWhileStatement1278 = new BitSet(new long[]{0x0000333082491100L,0x0000000002000000L});
    public static final BitSet FOLLOW_expression_in_doWhileStatement1280 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_doWhileStatement1282 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_doWhileStatement1284 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_74_in_returnStatement1301 = new BitSet(new long[]{0x0010333082491100L,0x0000000002000000L});
    public static final BitSet FOLLOW_expression_in_returnStatement1303 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_returnStatement1306 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionStatement1323 = new BitSet(new long[]{0x0010000000000000L});
    public static final BitSet FOLLOW_52_in_expressionStatement1326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_term_in_expression1343 = new BitSet(new long[]{0x07E4558D00000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_40_in_expression1350 = new BitSet(new long[]{0x0000333082491100L,0x0000000002000000L});
    public static final BitSet FOLLOW_44_in_expression1352 = new BitSet(new long[]{0x0000333082491100L,0x0000000002000000L});
    public static final BitSet FOLLOW_compareOp_in_expression1354 = new BitSet(new long[]{0x0000333082491100L,0x0000000002000000L});
    public static final BitSet FOLLOW_logicOp_in_expression1356 = new BitSet(new long[]{0x0000333082491100L,0x0000000002000000L});
    public static final BitSet FOLLOW_term_in_expression1359 = new BitSet(new long[]{0x07E4558D00000002L,0x0000000000800000L});
    public static final BitSet FOLLOW_assignmentOp_in_expression1364 = new BitSet(new long[]{0x0000333082491100L,0x0000000002000000L});
    public static final BitSet FOLLOW_expression_in_expression1367 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_factor_in_term1482 = new BitSet(new long[]{0x0000000000600802L});
    public static final BitSet FOLLOW_MULT_in_term1486 = new BitSet(new long[]{0x0000333082491100L,0x0000000002000000L});
    public static final BitSet FOLLOW_DIV_in_term1491 = new BitSet(new long[]{0x0000333082491100L,0x0000000002000000L});
    public static final BitSet FOLLOW_MOD_in_term1496 = new BitSet(new long[]{0x0000333082491100L,0x0000000002000000L});
    public static final BitSet FOLLOW_factor_in_term1500 = new BitSet(new long[]{0x0000000000600802L});
    public static final BitSet FOLLOW_prefixOp_in_factor1520 = new BitSet(new long[]{0x0000333082491100L,0x0000000002000000L});
    public static final BitSet FOLLOW_value_in_factor1525 = new BitSet(new long[]{0x0801A22000000002L});
    public static final BitSet FOLLOW_postfixOp_in_factor1527 = new BitSet(new long[]{0x0801A22000000002L});
    public static final BitSet FOLLOW_41_in_postfixOp1590 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_postfixOp1598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_postfixOp1606 = new BitSet(new long[]{0x0000333082491100L,0x0000000002000000L});
    public static final BitSet FOLLOW_expression_in_postfixOp1608 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_postfixOp1610 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_postfixOp1618 = new BitSet(new long[]{0x0000337082491100L,0x0000000002000000L});
    public static final BitSet FOLLOW_expressionList_in_postfixOp1620 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_postfixOp1623 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_postfixOp1631 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_postfixOp1633 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_postfixOp1641 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_postfixOp1643 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_value1660 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_LITERAL_in_value1668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_LITERAL_in_value1676 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_LITERAL_in_value1684 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CHAR_LITERAL_in_value1692 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_value1700 = new BitSet(new long[]{0x0000333082491100L,0x0000000002000000L});
    public static final BitSet FOLLOW_expression_in_value1702 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_value1704 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_expressionList1722 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_43_in_expressionList1725 = new BitSet(new long[]{0x0000333082491100L,0x0000000002000000L});
    public static final BitSet FOLLOW_expression_in_expressionList1727 = new BitSet(new long[]{0x0000080000000002L});
    public static final BitSet FOLLOW_71_in_dataType1746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_dataType1754 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_dataType1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_66_in_dataType1770 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_72_in_dataType1778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_75_in_dataType1786 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_83_in_dataType1794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_76_in_dataType1802 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_80_in_dataType1810 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_ID_in_dataType1812 = new BitSet(new long[]{0x0000000000000002L});

}