package parserlexer;
import java_cup.runtime.*;
%%

%public
%class Lexer
%cup
%line
%column
%full
%char

/* States definitions */
%state LITERALS
%state TYPES
%state ARRAYS
%state OPERATORS
%state BLOCKS
%state CONTROL_STRUCTURES
%state IO_OPERATORS

%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}

/* Macros for reusable regular expression patterns */
// Literals
integerLiteral       = 0|[-]?[1-9][0-9]*
floatLiteral         = {integerLiteral}"."{integerLiteral}*
boolLiteral          = "true" | "false"
characterLiteral     = '[^']*'
stringLiteral        = \"([^\"\\]|\\.)*\"

// Comments
LineTerminator       = \r|\n|\r\n
WhiteSpace           = {LineTerminator} | [ \t\f]
InputCharacter       = [^\r\n]
Comment              = {EndOfLineComment} | {DocumentationComment}
EndOfLineComment     = "#" {InputCharacter}* {LineTerminator}?
DocumentationComment = "\\_" {CommentContent} "_"+ "/"
CommentContent       = [^\\]*

// Others
BlankSpace           = [ \t\r]
newLine              = [\n]
%%

/* keywords */

<YYINITIAL> {
    /* Identifier Main */
    "_verano_"                      { return new Symbol(sym.Main, yychar, yyline, yytext()); }

    /* Identifiers */
    _[a-zA-Z0-9]+_                  { return new Symbol(sym.Identifier, yychar, yyline, yytext()); }

    /* Comments */
    {Comment}                       { return new Symbol(sym.Comment, yychar, yyline, yytext()); }
    
    /* New line */
    {newLine}                       { return new Symbol(sym.NewLine, yychar, yyline, yytext()); }

    /* Blank spaces */
    {BlankSpace}+                   { return new Symbol(sym.BlankSpace, yychar, yyline, yytext()); }
}

<YYINITIAL, LITERALS> {
    /* Integer literal */
    {integerLiteral}                { return new Symbol(sym.IntegerLiteral, yychar, yyline, yytext()); }

    /* Float literal */
    {floatLiteral}                  { return new Symbol(sym.FloatLiteral, yychar, yyline, yytext()); }

    /* Boolean literal */
    {boolLiteral}                   { return new Symbol(sym.BoolLiteral, yychar, yyline, yytext()); }

    /* Character literal */
    {characterLiteral}              { return new Symbol(sym.CharacterLiteral, yychar, yyline, yytext()); }

    /* String literal */
    {stringLiteral}                 { return new Symbol(sym.StringLiteral, yychar, yyline, yytext()); }

}

<YYINITIAL, TYPES> {
    "rodolfo"                       { return new Symbol(sym.Integer, yychar, yyline, yytext()); }
    "bromista"                      { return new Symbol(sym.Float, yychar, yyline, yytext()); }
    "trueno"                        { return new Symbol(sym.Bool, yychar, yyline, yytext()); }
    "cupido"                        { return new Symbol(sym.Char, yychar, yyline, yytext()); }
    "cometa"                        { return new Symbol(sym.String, yychar, yyline, yytext()); }
}

<YYINITIAL, ARRAYS> {
    /* Unidimensional array for integer or char */
    "abreempaque"                   { return new Symbol(sym.BracketOpening, yychar, yyline, yytext()); }
    "cierraempaque"                 { return new Symbol(sym.BracketClosure, yychar, yyline, yytext()); }
}

<YYINITIAL, OPERATORS> {
    /* Assignment sign */
    "entrega"                       { return new Symbol(sym.AssignmentSign, yychar, yyline, yytext()); }

    /* Parenthesis */
    "abreregalo"                    { return new Symbol(sym.ParenthesisOpening, yychar, yyline, yytext()); }
    "cierraregalo"                  { return new Symbol(sym.ParenthesisClosure, yychar, yyline, yytext()); }

    /* Binary arithmetic expressions */
    "navidad"                       { return new Symbol(sym.Sum, yychar, yyline, yytext()); }
    "intercambio"                   { return new Symbol(sym.Subtraction, yychar, yyline, yytext()); }
    "reyes"                         { return new Symbol(sym.Division, yychar, yyline, yytext()); }
    "nochebuena"                    { return new Symbol(sym.Multiplication, yychar, yyline, yytext()); }
    "magos"                         { return new Symbol(sym.Module, yychar, yyline, yytext()); }
    "adviento"                      { return new Symbol(sym.Power, yychar, yyline, yytext()); }

    /* Unary arithmetic expressions */
    "quien"                         { return new Symbol(sym.Increment, yychar, yyline, yytext()); }
    "grinch"                        { return new Symbol(sym.Decrement, yychar, yyline, yytext()); }
    "-"                             { return new Symbol(sym.Negative, yychar, yyline, yytext()); } 

    /* Relational expressions */
    "snowball"                      { return new Symbol(sym.Less, yychar, yyline, yytext()); }
    "evergreen"                     { return new Symbol(sym.LessEqual, yychar, yyline, yytext()); }
    "minstix"                       { return new Symbol(sym.Greater, yychar, yyline, yytext()); }
    "upatree"                       { return new Symbol(sym.GreaterEqual, yychar, yyline, yytext()); }
    "mary"                          { return new Symbol(sym.Equal, yychar, yyline, yytext()); }
    "openslae"                      { return new Symbol(sym.NotEqual, yychar, yyline, yytext()); }

    /* Logical expressions */
    "melchior"                      { return new Symbol(sym.Conjunction, yychar, yyline, yytext()); }
    "gaspar"                        { return new Symbol(sym.Disjunction, yychar, yyline, yytext()); }
    "balthazar"                     { return new Symbol(sym.Negation, yychar, yyline, yytext()); }
}

<YYINITIAL, BLOCKS> {
    /* Block opening  */
    "abrecuento"                    { return new Symbol(sym.BlockOpening, yychar, yyline, yytext()); }
    
    /* Block closing */
    "cierracuento"                  { return new Symbol(sym.BlockClosure, yychar, yyline, yytext()); }

    /* End sentence */
    "finregalo"                     { return new Symbol(sym.EndSentence, yychar, yyline, yytext()); }
}

<YYINITIAL, CONTROL_STRUCTURES> {
    "elfo"                          { return new Symbol(sym.If, yychar, yyline, yytext()); }
    "hada"                          { return new Symbol(sym.Else, yychar, yyline, yytext()); }
    "envuelve"                      { return new Symbol(sym.While, yychar, yyline, yytext()); }
    "duende"                        { return new Symbol(sym.For, yychar, yyline, yytext()); }
    "varios"                        { return new Symbol(sym.Switch, yychar, yyline, yytext()); }
    "historia"                      { return new Symbol(sym.Case, yychar, yyline, yytext()); }
    "ultimo"                        { return new Symbol(sym.Default, yychar, yyline, yytext()); }
    "corta"                         { return new Symbol(sym.Break, yychar, yyline, yytext()); }
    "envia"                         { return new Symbol(sym.Return, yychar, yyline, yytext()); }
    "sigue"                         { return new Symbol(sym.Colon, yychar, yyline, yytext()); }
    ","                             { return new Symbol(sym.Comma, yychar, yyline, yytext()); }
}

<YYINITIAL, IO_OPERATORS> {
    "narra"                         { return new Symbol(sym.Print, yychar, yyline, yytext()); }
    "escucha"                       { return new Symbol(sym.Read, yychar, yyline, yytext()); }

}

    /* Error de analisis */
    .                               { return new Symbol(sym.Error, yychar, yyline, yytext()); }

    /* Fin de archivo (EOF) */
    <<EOF>>                         { return new Symbol(sym.EndFile, yychar, yyline, yytext()); }
