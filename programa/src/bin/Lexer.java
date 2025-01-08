/* The following code was generated by JFlex 1.4.3 on 1/8/25, 7:28 AM */

package bin;
import java_cup.runtime.*;
import java.util.ArrayList;
import java.util.List;

/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 1/8/25, 7:28 AM from the specification file
 * <tt>D:/TEC/Verano 2024/Compiladores e Interpretes/PP02-Compiladores_E_Interpretes/programa/src/parserlexer/Lexer.flex</tt>
 */
public class Lexer implements java_cup.runtime.Scanner {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int IO_OPERATORS = 14;
  public static final int ARRAYS = 6;
  public static final int TYPES = 4;
  public static final int LITERALS = 2;
  public static final int YYINITIAL = 0;
  public static final int BLOCKS = 10;
  public static final int CONTROL_STRUCTURES = 12;
  public static final int OPERATORS = 8;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1,  1,  2,  2,  3,  3,  4,  4,  5,  5,  6,  6,  7, 7
  };

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = {
     0,  0,  0,  0,  0,  0,  0,  0,  0, 21, 16,  0,  0, 17,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
    21,  0, 14, 18,  0,  0,  0, 13,  0,  0,  0,  0, 39,  2,  4, 20, 
     1,  3,  3,  3,  3,  3,  3,  3,  3,  3,  0,  0,  0,  0,  0,  0, 
     0, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 
    25, 25, 25, 25, 25, 25, 25, 25, 25, 25, 25,  0, 15,  0,  0, 19, 
     0, 10, 27, 30, 26,  8,  9, 33, 35, 29, 25, 25, 11, 28, 23, 24, 
    31, 32,  6, 12,  5,  7, 22, 36, 37, 34, 38,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0, 
     0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0,  0
  };

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\10\0\1\1\1\2\1\3\1\2\12\1\1\4\1\5"+
    "\1\6\14\1\1\7\11\1\1\3\21\1\1\10\20\0"+
    "\1\11\1\0\1\12\2\0\2\6\65\0\1\13\37\0"+
    "\1\14\4\0\1\15\12\0\1\6\12\0\1\16\12\0"+
    "\1\17\1\0\1\14\10\0\1\20\7\0\1\21\6\0"+
    "\1\22\2\0\1\23\7\0\1\24\3\0\1\25\2\0"+
    "\1\26\6\0\1\27\1\0\1\30\14\0\1\31\3\0"+
    "\1\32\5\0\1\33\1\34\1\0\1\35\1\36\4\0"+
    "\1\37\1\40\1\41\1\0\1\42\10\0\1\43\4\0"+
    "\1\44\1\45\6\0\1\46\1\0\1\47\3\0\1\50"+
    "\1\51\1\0\1\52\1\53\5\0\1\54\1\55\1\56"+
    "\4\0\1\57\4\0\1\60\1\0\1\61\1\62\4\0"+
    "\1\63\1\64\3\0\1\65\1\0\1\66\1\67";

  private static int [] zzUnpackAction() {
    int [] result = new int[368];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\50\0\120\0\170\0\240\0\310\0\360\0\u0118"+
    "\0\u0140\0\u0168\0\u0190\0\u01b8\0\u01e0\0\u0208\0\u0230\0\u0258"+
    "\0\u0280\0\u02a8\0\u02d0\0\u02f8\0\u0320\0\u0348\0\u0140\0\u0370"+
    "\0\u0398\0\u03c0\0\u03e8\0\u0410\0\u0438\0\u0460\0\u0488\0\u04b0"+
    "\0\u04d8\0\u0500\0\u0528\0\u0550\0\u0578\0\u0140\0\u0190\0\u05a0"+
    "\0\u05c8\0\u05f0\0\u0618\0\u0640\0\u0668\0\u0690\0\u06b8\0\u0140"+
    "\0\u06e0\0\u0708\0\u0730\0\u0758\0\u0780\0\u07a8\0\u07d0\0\u07f8"+
    "\0\u0820\0\u0848\0\u0870\0\u0898\0\u08c0\0\u08e8\0\u0910\0\u0938"+
    "\0\u0960\0\u0988\0\u09b0\0\u09d8\0\u0a00\0\u0a28\0\u0a50\0\u0a78"+
    "\0\u0aa0\0\u0ac8\0\u0af0\0\u0b18\0\u0b40\0\u0b68\0\u0b90\0\u0bb8"+
    "\0\u0be0\0\u02f8\0\u0140\0\u0320\0\u0140\0\u0c08\0\u0c30\0\u0140"+
    "\0\u0c58\0\u0c80\0\u0ca8\0\u0cd0\0\u0cf8\0\u0d20\0\u0d48\0\u0d70"+
    "\0\u0d98\0\u0dc0\0\u0de8\0\u0e10\0\u0e38\0\u0e60\0\u0e88\0\u0eb0"+
    "\0\u0ed8\0\u0f00\0\u0f28\0\u0f50\0\u0f78\0\u0fa0\0\u0fc8\0\u0ff0"+
    "\0\u1018\0\u1040\0\u1068\0\u1090\0\u10b8\0\u10e0\0\u1108\0\u1130"+
    "\0\u1158\0\u1180\0\u11a8\0\u11d0\0\u11f8\0\u1220\0\u1248\0\u1270"+
    "\0\u1298\0\u12c0\0\u12e8\0\u1310\0\u1338\0\u1360\0\u1388\0\u13b0"+
    "\0\u13d8\0\u1400\0\u1428\0\u1450\0\u1478\0\u14a0\0\u0140\0\u14c8"+
    "\0\u14f0\0\u1518\0\u1540\0\u1568\0\u1590\0\u15b8\0\u15e0\0\u1608"+
    "\0\u1630\0\u1658\0\u1680\0\u16a8\0\u16d0\0\u16f8\0\u1720\0\u1748"+
    "\0\u1770\0\u1798\0\u17c0\0\u17e8\0\u1810\0\u1838\0\u1860\0\u1888"+
    "\0\u18b0\0\u18d8\0\u1900\0\u1928\0\u1950\0\u1978\0\u19a0\0\u19c8"+
    "\0\u19f0\0\u1a18\0\u1a40\0\u0140\0\u1a68\0\u1a90\0\u1ab8\0\u1ae0"+
    "\0\u1b08\0\u1b30\0\u1b58\0\u1b80\0\u1ba8\0\u1bd0\0\u0c30\0\u1bf8"+
    "\0\u1c20\0\u1c48\0\u1c70\0\u1c98\0\u1cc0\0\u1ce8\0\u1d10\0\u1d38"+
    "\0\u1d60\0\u0140\0\u1d88\0\u1db0\0\u1dd8\0\u1e00\0\u1e28\0\u1e50"+
    "\0\u1e78\0\u1ea0\0\u1ec8\0\u1ef0\0\u0140\0\u1f18\0\u0140\0\u19a0"+
    "\0\u1f40\0\u1f68\0\u1f90\0\u1fb8\0\u1fe0\0\u2008\0\u2030\0\u0140"+
    "\0\u2058\0\u2080\0\u20a8\0\u20d0\0\u20f8\0\u2120\0\u2148\0\u0140"+
    "\0\u2170\0\u2198\0\u21c0\0\u21e8\0\u2210\0\u2238\0\u0140\0\u2260"+
    "\0\u2288\0\u0140\0\u22b0\0\u22d8\0\u2300\0\u2328\0\u2350\0\u2378"+
    "\0\u23a0\0\u0140\0\u23c8\0\u23f0\0\u2418\0\u0140\0\u2440\0\u2468"+
    "\0\u0140\0\u2490\0\u24b8\0\u24e0\0\u2508\0\u2530\0\u2558\0\u0140"+
    "\0\u2580\0\u0140\0\u25a8\0\u25d0\0\u25f8\0\u2620\0\u2648\0\u2670"+
    "\0\u2698\0\u26c0\0\u26e8\0\u2710\0\u2738\0\u2760\0\u0140\0\u2788"+
    "\0\u27b0\0\u27d8\0\u0140\0\u2800\0\u2828\0\u2850\0\u2878\0\u28a0"+
    "\0\u0140\0\u0140\0\u28c8\0\u0140\0\u0140\0\u28f0\0\u2918\0\u2940"+
    "\0\u2968\0\u0140\0\u0140\0\u0140\0\u2990\0\u0140\0\u29b8\0\u29e0"+
    "\0\u2a08\0\u2a30\0\u2a58\0\u2a80\0\u2aa8\0\u2ad0\0\u0140\0\u2af8"+
    "\0\u2b20\0\u2b48\0\u2b70\0\u0140\0\u0140\0\u2b98\0\u2bc0\0\u2be8"+
    "\0\u2c10\0\u2c38\0\u2c60\0\u0140\0\u2c88\0\u0140\0\u2cb0\0\u2cd8"+
    "\0\u2d00\0\u0140\0\u0140\0\u2d28\0\u0140\0\u0140\0\u2d50\0\u2d78"+
    "\0\u2da0\0\u2dc8\0\u2df0\0\u0140\0\u0140\0\u0140\0\u2e18\0\u2e40"+
    "\0\u2e68\0\u2e90\0\u0140\0\u2eb8\0\u2ee0\0\u2f08\0\u2f30\0\u0140"+
    "\0\u2f58\0\u0140\0\u0140\0\u2f80\0\u2fa8\0\u2fd0\0\u2ff8\0\u0140"+
    "\0\u0140\0\u3020\0\u3048\0\u3070\0\u0140\0\u3098\0\u0140\0\u0140";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[368];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\1\11\1\12\1\13\1\14\1\11\1\15\1\16\1\17"+
    "\1\20\1\21\1\22\1\11\1\23\1\24\1\25\1\26"+
    "\1\27\1\30\1\31\1\32\1\11\1\30\1\33\1\34"+
    "\1\35\1\11\1\36\1\37\1\40\1\41\1\42\1\11"+
    "\1\43\1\44\1\11\1\45\3\11\1\46\1\11\1\12"+
    "\1\47\1\14\1\11\1\50\3\11\1\51\3\11\1\24"+
    "\1\25\1\11\1\0\34\11\1\52\1\53\11\11\1\0"+
    "\12\11\1\54\2\11\1\55\23\11\1\56\5\11\1\0"+
    "\15\11\1\57\13\11\1\60\3\11\1\61\1\62\1\63"+
    "\1\11\1\64\1\11\1\65\3\11\1\0\6\11\1\66"+
    "\1\35\2\11\1\67\1\40\1\41\1\70\1\11\1\43"+
    "\1\44\17\11\1\71\1\72\5\11\1\0\15\11\1\73"+
    "\20\11\1\74\1\75\3\11\1\76\3\11\1\0\5\11"+
    "\1\33\3\11\1\36\3\11\1\77\4\11\1\45\3\11"+
    "\1\46\10\11\1\100\7\11\1\0\6\11\1\101\20\11"+
    "\54\0\1\102\46\0\1\14\45\0\1\14\1\0\1\14"+
    "\1\102\51\0\1\103\51\0\1\104\17\0\1\105\32\0"+
    "\1\106\23\0\1\107\23\0\1\110\1\111\11\0\1\112"+
    "\1\113\32\0\1\114\22\0\1\115\44\0\1\116\1\117"+
    "\43\0\1\120\5\0\1\121\12\0\15\122\1\123\32\122"+
    "\16\124\1\125\1\126\30\124\23\0\1\127\45\0\1\30"+
    "\3\0\1\30\22\0\20\31\1\130\1\131\26\31\1\0"+
    "\1\132\1\0\1\132\1\0\10\132\11\0\1\133\20\132"+
    "\13\0\1\134\47\0\1\135\15\0\1\136\56\0\1\137"+
    "\17\0\1\140\46\0\1\141\3\0\1\142\45\0\1\143"+
    "\1\0\1\144\22\0\1\145\41\0\1\146\27\0\1\147"+
    "\20\0\1\150\4\0\1\151\21\0\1\152\46\0\1\153"+
    "\3\0\1\154\47\0\1\155\22\0\1\156\20\0\1\157"+
    "\53\0\1\114\43\0\1\160\71\0\1\105\25\0\1\141"+
    "\50\0\1\147\20\0\1\161\52\0\1\162\51\0\1\163"+
    "\22\0\1\104\76\0\1\107\36\0\1\112\1\164\52\0"+
    "\1\116\1\165\43\0\1\120\32\0\1\166\15\0\1\136"+
    "\31\0\1\142\72\0\1\167\47\0\1\115\45\0\1\170"+
    "\51\0\1\171\25\0\1\106\47\0\1\110\13\0\1\172"+
    "\55\0\1\121\42\0\1\173\33\0\1\111\45\0\1\174"+
    "\36\0\1\102\1\175\1\102\53\0\1\176\102\0\1\177"+
    "\37\0\1\200\22\0\1\201\54\0\1\202\46\0\1\203"+
    "\74\0\1\204\21\0\1\205\44\0\1\206\20\0\1\207"+
    "\34\0\1\210\63\0\1\211\46\0\1\212\27\0\1\213"+
    "\71\0\1\214\60\0\1\215\6\0\20\124\1\0\27\124"+
    "\17\127\1\0\3\127\1\216\24\127\20\0\1\130\30\0"+
    "\1\132\1\0\1\132\1\0\10\132\6\0\1\217\2\0"+
    "\21\132\2\0\1\132\1\0\1\132\1\0\3\132\1\220"+
    "\4\132\6\0\1\217\2\0\21\132\7\0\1\221\47\0"+
    "\1\222\17\0\1\223\57\0\1\224\21\0\1\225\47\0"+
    "\1\226\67\0\1\227\32\0\1\230\47\0\1\231\42\0"+
    "\1\232\32\0\1\233\35\0\1\234\25\0\1\235\101\0"+
    "\1\236\16\0\1\237\25\0\1\240\23\0\1\241\74\0"+
    "\1\242\47\0\1\243\26\0\1\244\65\0\1\245\31\0"+
    "\1\246\42\0\1\247\47\0\1\250\74\0\1\240\21\0"+
    "\1\251\51\0\1\252\44\0\1\206\50\0\1\253\67\0"+
    "\1\223\31\0\1\254\45\0\1\255\51\0\1\256\65\0"+
    "\1\207\27\0\1\237\47\0\1\222\44\0\1\102\54\0"+
    "\1\257\47\0\1\260\67\0\1\261\54\0\1\262\17\0"+
    "\1\263\72\0\1\264\26\0\1\265\46\0\1\266\47\0"+
    "\1\267\50\0\1\270\25\0\1\271\26\0\1\247\41\0"+
    "\1\272\76\0\1\273\22\0\1\274\103\0\1\275\12\0"+
    "\1\276\40\0\17\127\1\0\3\127\1\216\1\277\23\127"+
    "\1\0\1\132\1\0\1\132\1\0\1\132\1\300\6\132"+
    "\6\0\1\217\2\0\21\132\36\0\1\301\20\0\1\302"+
    "\76\0\1\303\55\0\1\304\33\0\1\305\47\0\1\306"+
    "\54\0\1\307\20\0\1\310\100\0\1\311\53\0\1\312"+
    "\35\0\1\313\33\0\1\314\43\0\1\315\74\0\1\316"+
    "\17\0\1\317\52\0\1\320\45\0\1\321\51\0\1\322"+
    "\66\0\1\323\57\0\1\324\22\0\1\325\42\0\1\326"+
    "\52\0\1\327\47\0\1\330\47\0\1\331\45\0\1\332"+
    "\51\0\1\333\45\0\1\334\51\0\1\335\45\0\1\336"+
    "\70\0\1\337\34\0\1\340\46\0\1\341\70\0\1\342"+
    "\21\0\1\343\77\0\1\344\52\0\1\345\16\0\1\346"+
    "\47\0\1\347\51\0\1\350\45\0\1\351\47\0\1\352"+
    "\45\0\1\353\1\0\1\354\25\0\1\355\44\0\1\356"+
    "\24\0\1\357\40\0\1\132\1\0\1\132\1\0\5\132"+
    "\1\360\2\132\6\0\1\217\2\0\21\132\31\0\1\361"+
    "\31\0\1\362\67\0\1\363\25\0\1\364\53\0\1\365"+
    "\65\0\1\366\52\0\1\367\55\0\1\370\47\0\1\371"+
    "\20\0\1\372\40\0\1\373\50\0\1\374\73\0\1\375"+
    "\27\0\1\376\42\0\1\377\50\0\1\u0100\70\0\1\u0101"+
    "\56\0\1\u0102\23\0\1\u0103\65\0\1\u0104\27\0\1\354"+
    "\45\0\1\u0105\47\0\1\353\47\0\1\u0106\77\0\1\355"+
    "\17\0\1\u0107\71\0\1\u0108\30\0\1\u0109\66\0\1\u010a"+
    "\27\0\1\u010b\102\0\1\u010c\12\0\1\u010d\102\0\1\u010e"+
    "\21\0\1\u010f\75\0\1\u0110\35\0\1\u0111\30\0\1\u0112"+
    "\73\0\1\u0113\22\0\1\u0114\52\0\1\u0115\36\0\1\132"+
    "\1\0\1\132\1\0\10\132\6\0\1\217\2\0\1\132"+
    "\1\u0116\17\132\15\0\1\u0117\45\0\1\u0118\70\0\1\u0119"+
    "\27\0\1\u011a\44\0\1\u011b\53\0\1\u011c\45\0\1\u011d"+
    "\65\0\1\u011e\54\0\1\u011f\50\0\1\u0120\41\0\1\u0121"+
    "\31\0\1\u0122\47\0\1\u0123\100\0\1\u0124\12\0\1\u0125"+
    "\47\0\1\u0126\53\0\1\u0127\47\0\1\u0128\47\0\1\u0129"+
    "\65\0\1\u012a\27\0\1\u012b\51\0\1\u012c\45\0\1\u012d"+
    "\51\0\1\u012e\63\0\1\u012f\33\0\1\u0130\42\0\1\u0131"+
    "\103\0\1\u0132\45\0\1\u0133\20\0\1\u0134\52\0\1\u0135"+
    "\35\0\1\132\1\0\1\132\1\0\10\132\6\0\1\217"+
    "\2\0\2\132\1\u0136\16\132\33\0\1\u0137\24\0\1\u0138"+
    "\52\0\1\u0139\42\0\1\u013a\110\0\1\u013b\7\0\1\u013c"+
    "\106\0\1\u013d\14\0\1\u013e\43\0\1\u013f\1\0\1\u0140"+
    "\25\0\1\u0141\46\0\1\u0142\22\0\1\u0140\45\0\1\u013f"+
    "\77\0\1\u0141\21\0\1\u0143\47\0\1\u0144\52\0\1\u0145"+
    "\64\0\1\u0146\31\0\1\u0147\47\0\1\u0148\64\0\1\u0149"+
    "\33\0\1\u014a\35\0\1\132\1\0\1\132\1\0\10\132"+
    "\6\0\1\u014b\2\0\21\132\11\0\1\u014c\47\0\1\u014d"+
    "\51\0\1\u014e\47\0\1\u014f\71\0\1\u0150\23\0\1\u0151"+
    "\73\0\1\u0152\22\0\1\u0153\52\0\1\u0154\64\0\1\u0155"+
    "\50\0\1\u0156\32\0\1\u0157\74\0\1\u0158\14\0\1\u0159"+
    "\71\0\1\u015a\26\0\1\u015b\74\0\1\u015c\55\0\1\u015d"+
    "\45\0\1\u015e\20\0\1\u015f\67\0\1\u0160\26\0\1\u0161"+
    "\70\0\1\u0162\31\0\1\u0163\72\0\1\u0164\24\0\1\u0165"+
    "\47\0\1\u0166\64\0\1\u0167\30\0\1\u0168\67\0\1\u0169"+
    "\32\0\1\u016a\74\0\1\u016b\14\0\1\u016c\72\0\1\u016d"+
    "\26\0\1\u016e\70\0\1\u016f\27\0\1\u0170\37\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[12480];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\10\0\1\11\15\1\1\11\16\1\1\11\11\1\1\11"+
    "\22\1\20\0\1\11\1\0\1\11\2\0\1\11\1\1"+
    "\65\0\1\11\37\0\1\1\4\0\1\11\12\0\1\1"+
    "\12\0\1\11\12\0\1\11\1\0\1\11\10\0\1\11"+
    "\7\0\1\11\6\0\1\11\2\0\1\11\7\0\1\11"+
    "\3\0\1\11\2\0\1\11\6\0\1\11\1\0\1\11"+
    "\14\0\1\11\3\0\1\11\5\0\2\11\1\0\2\11"+
    "\4\0\3\11\1\0\1\11\10\0\1\11\4\0\2\11"+
    "\6\0\1\11\1\0\1\11\3\0\2\11\1\0\2\11"+
    "\5\0\3\11\4\0\1\11\4\0\1\11\1\0\2\11"+
    "\4\0\2\11\3\0\1\11\1\0\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[368];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the input device */
  private java.io.Reader zzReader;

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private char zzBuffer[] = new char[ZZ_BUFFERSIZE];

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /** number of newlines encountered up to the start of the matched text */
  private int yyline;

  /** the number of characters up to the start of the matched text */
  private int yychar;

  /**
   * the number of characters from the last newline up to the start of the 
   * matched text
   */
  private int yycolumn;

  /** 
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;

  /* user code: */
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
    
    //Lista de errores controlados
    public List<Symbol> lexErrorList = new ArrayList<>();
    
    // Agrega errores controlados a la lista
    public void logError(int column,int line,String text) {
        Symbol symbol = new Symbol(sym.Error, column, line, text);
        lexErrorList.add(symbol);
    }


  /**
   * Creates a new scanner
   * There is also a java.io.InputStream version of this constructor.
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public Lexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public Lexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }


  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   * 
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {

    /* first: make room (if you can) */
    if (zzStartRead > 0) {
      System.arraycopy(zzBuffer, zzStartRead,
                       zzBuffer, 0,
                       zzEndRead-zzStartRead);

      /* translate stored positions */
      zzEndRead-= zzStartRead;
      zzCurrentPos-= zzStartRead;
      zzMarkedPos-= zzStartRead;
      zzStartRead = 0;
    }

    /* is the buffer big enough? */
    if (zzCurrentPos >= zzBuffer.length) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzCurrentPos*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
    }

    /* finally: fill the buffer with new input */
    int numRead = zzReader.read(zzBuffer, zzEndRead,
                                            zzBuffer.length-zzEndRead);

    if (numRead > 0) {
      zzEndRead+= numRead;
      return false;
    }
    // unlikely but not impossible: read 0 characters, but not at end of stream    
    if (numRead == 0) {
      int c = zzReader.read();
      if (c == -1) {
        return true;
      } else {
        zzBuffer[zzEndRead++] = (char) c;
        return false;
      }     
    }

	// numRead < 0
    return true;
  }

    
  /**
   * Closes the input stream.
   */
  public final void yyclose() throws java.io.IOException {
    zzAtEOF = true;            /* indicate end of file */
    zzEndRead = zzStartRead;  /* invalidate buffer    */

    if (zzReader != null)
      zzReader.close();
  }


  /**
   * Resets the scanner to read from a new input stream.
   * Does not close the old reader.
   *
   * All internal variables are reset, the old input stream 
   * <b>cannot</b> be reused (internal buffer is discarded and lost).
   * Lexical state is set to <tt>ZZ_INITIAL</tt>.
   *
   * @param reader   the new input stream 
   */
  public final void yyreset(java.io.Reader reader) {
    zzReader = reader;
    zzAtBOL  = true;
    zzAtEOF  = false;
    zzEOFDone = false;
    zzEndRead = zzStartRead = 0;
    zzCurrentPos = zzMarkedPos = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final String yytext() {
    return new String( zzBuffer, zzStartRead, zzMarkedPos-zzStartRead );
  }


  /**
   * Returns the character at position <tt>pos</tt> from the 
   * matched text. 
   * 
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch. 
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBuffer[zzStartRead+pos];
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of 
   * yypushback(int) and a match-all fallback rule) this method 
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  } 


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() throws java.io.IOException {
    if (!zzEOFDone) {
      zzEOFDone = true;
      yyclose();
    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public java_cup.runtime.Symbol next_token() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    char [] zzBufferL = zzBuffer;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      yychar+= zzMarkedPosL-zzStartRead;

      boolean zzR = false;
      for (zzCurrentPosL = zzStartRead; zzCurrentPosL < zzMarkedPosL;
                                                             zzCurrentPosL++) {
        switch (zzBufferL[zzCurrentPosL]) {
        case '\u000B':
        case '\u000C':
        case '\u0085':
        case '\u2028':
        case '\u2029':
          yyline++;
          yycolumn = 0;
          zzR = false;
          break;
        case '\r':
          yyline++;
          yycolumn = 0;
          zzR = true;
          break;
        case '\n':
          if (zzR)
            zzR = false;
          else {
            yyline++;
            yycolumn = 0;
          }
          break;
        default:
          zzR = false;
          yycolumn++;
        }
      }

      if (zzR) {
        // peek one character ahead if it is \n (if we have counted one line too much)
        boolean zzPeek;
        if (zzMarkedPosL < zzEndReadL)
          zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        else if (zzAtEOF)
          zzPeek = false;
        else {
          boolean eof = zzRefill();
          zzEndReadL = zzEndRead;
          zzMarkedPosL = zzMarkedPos;
          zzBufferL = zzBuffer;
          if (eof) 
            zzPeek = false;
          else 
            zzPeek = zzBufferL[zzMarkedPosL] == '\n';
        }
        if (zzPeek) yyline--;
      }
      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL[zzCurrentPosL++];
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL[zzCurrentPosL++];
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 40: 
          { return new Symbol(sym.Less, yycolumn, yyline, yytext());
          }
        case 56: break;
        case 22: 
          { return new Symbol(sym.Increment, yycolumn, yyline, yytext());
          }
        case 57: break;
        case 9: 
          { return new Symbol(sym.CharacterLiteral, yycolumn, yyline, yytext());
          }
        case 58: break;
        case 26: 
          { return new Symbol(sym.For, yycolumn, yyline, yytext());
          }
        case 59: break;
        case 27: 
          { return new Symbol(sym.Char, yycolumn, yyline, yytext());
          }
        case 60: break;
        case 33: 
          { return new Symbol(sym.Read, yycolumn, yyline, yytext());
          }
        case 61: break;
        case 54: 
          { return new Symbol(sym.BlockClosure, yycolumn, yyline, yytext());
          }
        case 62: break;
        case 15: 
          { return new Symbol(sym.Else, yycolumn, yyline, yytext());
          }
        case 63: break;
        case 23: 
          { return new Symbol(sym.Bool, yycolumn, yyline, yytext());
          }
        case 64: break;
        case 8: 
          { return new Symbol(sym.FloatLiteral, yycolumn, yyline, yytext());
          }
        case 65: break;
        case 31: 
          { return new Symbol(sym.Integer, yycolumn, yyline, yytext());
          }
        case 66: break;
        case 1: 
          { logError(yycolumn, yyline, yytext());
          }
        case 67: break;
        case 28: 
          { return new Symbol(sym.String, yycolumn, yyline, yytext());
          }
        case 68: break;
        case 24: 
          { return new Symbol(sym.Default, yycolumn, yyline, yytext());
          }
        case 69: break;
        case 4: 
          { /* Ignorará nuevas lineas */
          }
        case 70: break;
        case 21: 
          { return new Symbol(sym.Break, yycolumn, yyline, yytext());
          }
        case 71: break;
        case 38: 
          { return new Symbol(sym.While, yycolumn, yyline, yytext());
          }
        case 72: break;
        case 3: 
          { return new Symbol(sym.Negative, yycolumn, yyline, yytext());
          }
        case 73: break;
        case 12: 
          { return new Symbol(sym.BoolLiteral, yycolumn, yyline, yytext());
          }
        case 74: break;
        case 32: 
          { return new Symbol(sym.GreaterEqual, yycolumn, yyline, yytext());
          }
        case 75: break;
        case 43: 
          { return new Symbol(sym.Float, yycolumn, yyline, yytext());
          }
        case 76: break;
        case 51: 
          { return new Symbol(sym.BracketOpening, yycolumn, yyline, yytext());
          }
        case 77: break;
        case 48: 
          { return new Symbol(sym.ParenthesisOpening, yycolumn, yyline, yytext());
          }
        case 78: break;
        case 42: 
          { return new Symbol(sym.NotEqual, yycolumn, yyline, yytext());
          }
        case 79: break;
        case 11: 
          { return new Symbol(sym.Identifier, yycolumn, yyline, yytext());
          }
        case 80: break;
        case 17: 
          { return new Symbol(sym.Return, yycolumn, yyline, yytext());
          }
        case 81: break;
        case 30: 
          { return new Symbol(sym.Disjunction, yycolumn, yyline, yytext());
          }
        case 82: break;
        case 18: 
          { return new Symbol(sym.Colon, yycolumn, yyline, yytext());
          }
        case 83: break;
        case 46: 
          { return new Symbol(sym.EndSentence, yycolumn, yyline, yytext());
          }
        case 84: break;
        case 37: 
          { return new Symbol(sym.Greater, yycolumn, yyline, yytext());
          }
        case 85: break;
        case 20: 
          { return new Symbol(sym.Module, yycolumn, yyline, yytext());
          }
        case 86: break;
        case 13: 
          { return new Symbol(sym.If, yycolumn, yyline, yytext());
          }
        case 87: break;
        case 50: 
          { return new Symbol(sym.Multiplication, yycolumn, yyline, yytext());
          }
        case 88: break;
        case 29: 
          { return new Symbol(sym.Decrement, yycolumn, yyline, yytext());
          }
        case 89: break;
        case 44: 
          { return new Symbol(sym.Case, yycolumn, yyline, yytext());
          }
        case 90: break;
        case 19: 
          { return new Symbol(sym.Print, yycolumn, yyline, yytext());
          }
        case 91: break;
        case 41: 
          { return new Symbol(sym.Main, yycolumn, yyline, yytext());
          }
        case 92: break;
        case 25: 
          { return new Symbol(sym.Switch, yycolumn, yyline, yytext());
          }
        case 93: break;
        case 5: 
          { /* Ignorará espacios en blanco */
          }
        case 94: break;
        case 39: 
          { return new Symbol(sym.Power, yycolumn, yyline, yytext());
          }
        case 95: break;
        case 7: 
          { return new Symbol(sym.Comma, yycolumn, yyline, yytext());
          }
        case 96: break;
        case 47: 
          { return new Symbol(sym.Negation, yycolumn, yyline, yytext());
          }
        case 97: break;
        case 16: 
          { return new Symbol(sym.Division, yycolumn, yyline, yytext());
          }
        case 98: break;
        case 36: 
          { return new Symbol(sym.Conjunction, yycolumn, yyline, yytext());
          }
        case 99: break;
        case 10: 
          { return new Symbol(sym.StringLiteral, yycolumn, yyline, yytext());
          }
        case 100: break;
        case 14: 
          { return new Symbol(sym.Equal, yycolumn, yyline, yytext());
          }
        case 101: break;
        case 35: 
          { return new Symbol(sym.Sum, yycolumn, yyline, yytext());
          }
        case 102: break;
        case 2: 
          { return new Symbol(sym.IntegerLiteral, yycolumn, yyline, yytext());
          }
        case 103: break;
        case 49: 
          { return new Symbol(sym.BlockOpening, yycolumn, yyline, yytext());
          }
        case 104: break;
        case 55: 
          { return new Symbol(sym.BracketClosure, yycolumn, yyline, yytext());
          }
        case 105: break;
        case 53: 
          { return new Symbol(sym.ParenthesisClosure, yycolumn, yyline, yytext());
          }
        case 106: break;
        case 52: 
          { return new Symbol(sym.Subtraction, yycolumn, yyline, yytext());
          }
        case 107: break;
        case 6: 
          { /* Ignorará comentarios*/
          }
        case 108: break;
        case 34: 
          { return new Symbol(sym.AssignmentSign, yycolumn, yyline, yytext());
          }
        case 109: break;
        case 45: 
          { return new Symbol(sym.LessEqual, yycolumn, yyline, yytext());
          }
        case 110: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
              { return new java_cup.runtime.Symbol(sym.EOF); }
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
