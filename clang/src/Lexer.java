/* The following code was generated by JFlex 1.6.0 */



/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.6.0
 * from the specification file <tt>src/c-lang.flex</tt>
 */
class Lexer {

  /** This character denotes the end of file */
  public static final int YYEOF = -1;

  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;
  private static final String ZZ_NL = System.getProperty("line.separator");

  /** lexical states */
  public static final int YYINITIAL = 0;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\12\0\1\12\1\13\1\13\1\12\24\0\1\37\1\1\4\0\1\16"+
    "\1\17\1\26\1\24\1\20\1\25\1\0\1\27\12\36\1\0\1\21"+
    "\1\11\1\30\1\14\2\0\32\15\4\0\1\15\1\0\1\15\1\33"+
    "\1\4\1\7\1\10\1\34\2\15\1\2\2\15\1\5\1\15\1\3"+
    "\1\32\2\15\1\35\1\15\1\31\1\6\5\15\1\22\1\0\1\23"+
    "\7\0\1\13\44\0\1\15\12\0\1\15\4\0\1\15\5\0\27\15"+
    "\1\0\37\15\1\0\u01ca\15\4\0\14\15\16\0\5\15\7\0\1\15"+
    "\1\0\1\15\21\0\165\15\1\0\2\15\2\0\4\15\1\0\1\15"+
    "\6\0\1\15\1\0\3\15\1\0\1\15\1\0\24\15\1\0\123\15"+
    "\1\0\213\15\1\0\255\15\1\0\46\15\2\0\1\15\7\0\47\15"+
    "\11\0\55\15\1\0\1\15\1\0\2\15\1\0\2\15\1\0\1\15"+
    "\10\0\33\15\5\0\3\15\35\0\13\15\5\0\100\15\12\36\4\0"+
    "\146\15\1\0\10\15\2\0\12\15\1\0\6\15\12\36\3\15\2\0"+
    "\1\15\20\0\73\15\2\0\145\15\16\0\12\36\54\15\4\0\1\15"+
    "\5\0\56\15\22\0\34\15\104\0\23\15\61\0\200\15\2\0\12\36"+
    "\1\0\23\15\1\0\10\15\2\0\2\15\2\0\26\15\1\0\7\15"+
    "\1\0\1\15\3\0\4\15\2\0\11\15\2\0\2\15\2\0\4\15"+
    "\10\0\1\15\4\0\2\15\1\0\5\15\2\0\12\36\2\15\17\0"+
    "\3\15\1\0\6\15\4\0\2\15\2\0\26\15\1\0\7\15\1\0"+
    "\2\15\1\0\2\15\1\0\2\15\2\0\1\15\1\0\5\15\4\0"+
    "\2\15\2\0\3\15\3\0\1\15\7\0\4\15\1\0\1\15\7\0"+
    "\12\36\6\15\13\0\3\15\1\0\11\15\1\0\3\15\1\0\26\15"+
    "\1\0\7\15\1\0\2\15\1\0\5\15\2\0\12\15\1\0\3\15"+
    "\1\0\3\15\2\0\1\15\17\0\4\15\2\0\12\36\21\0\3\15"+
    "\1\0\10\15\2\0\2\15\2\0\26\15\1\0\7\15\1\0\2\15"+
    "\1\0\5\15\2\0\11\15\2\0\2\15\2\0\3\15\10\0\2\15"+
    "\4\0\2\15\1\0\5\15\2\0\12\36\1\0\1\15\20\0\2\15"+
    "\1\0\6\15\3\0\3\15\1\0\4\15\3\0\2\15\1\0\1\15"+
    "\1\0\2\15\3\0\2\15\3\0\3\15\3\0\14\15\4\0\5\15"+
    "\3\0\3\15\1\0\4\15\2\0\1\15\6\0\1\15\16\0\12\36"+
    "\20\0\4\15\1\0\10\15\1\0\3\15\1\0\27\15\1\0\20\15"+
    "\3\0\10\15\1\0\3\15\1\0\4\15\7\0\2\15\1\0\2\15"+
    "\6\0\4\15\2\0\12\36\21\0\3\15\1\0\10\15\1\0\3\15"+
    "\1\0\27\15\1\0\12\15\1\0\5\15\2\0\11\15\1\0\3\15"+
    "\1\0\4\15\7\0\2\15\7\0\1\15\1\0\4\15\2\0\12\36"+
    "\1\0\2\15\16\0\3\15\1\0\10\15\1\0\3\15\1\0\51\15"+
    "\2\0\10\15\1\0\3\15\1\0\5\15\10\0\1\15\10\0\4\15"+
    "\2\0\12\36\12\0\6\15\2\0\2\15\1\0\22\15\3\0\30\15"+
    "\1\0\11\15\1\0\1\15\2\0\7\15\3\0\1\15\4\0\6\15"+
    "\1\0\1\15\1\0\10\15\6\0\12\36\2\0\2\15\15\0\72\15"+
    "\5\0\17\15\1\0\12\36\47\0\2\15\1\0\1\15\2\0\2\15"+
    "\1\0\1\15\2\0\1\15\6\0\4\15\1\0\7\15\1\0\3\15"+
    "\1\0\1\15\1\0\1\15\2\0\2\15\1\0\15\15\1\0\3\15"+
    "\2\0\5\15\1\0\1\15\1\0\6\15\2\0\12\36\2\0\4\15"+
    "\40\0\1\15\27\0\2\15\6\0\12\36\13\0\1\15\1\0\1\15"+
    "\1\0\1\15\4\0\12\15\1\0\44\15\4\0\24\15\1\0\22\15"+
    "\1\0\44\15\11\0\1\15\71\0\100\15\12\36\6\0\100\15\12\36"+
    "\4\15\2\0\46\15\1\0\1\15\5\0\1\15\2\0\53\15\1\0"+
    "\u014d\15\1\0\4\15\2\0\7\15\1\0\1\15\1\0\4\15\2\0"+
    "\51\15\1\0\4\15\2\0\41\15\1\0\4\15\2\0\7\15\1\0"+
    "\1\15\1\0\4\15\2\0\17\15\1\0\71\15\1\0\4\15\2\0"+
    "\103\15\2\0\3\15\40\0\20\15\20\0\125\15\14\0\u026c\15\2\0"+
    "\21\15\1\0\32\15\5\0\113\15\3\0\13\15\7\0\15\15\1\0"+
    "\7\15\13\0\25\15\13\0\24\15\14\0\15\15\1\0\3\15\1\0"+
    "\2\15\14\0\124\15\3\0\1\15\4\0\2\15\2\0\12\36\41\0"+
    "\3\15\2\0\12\36\6\0\130\15\10\0\53\15\5\0\106\15\12\0"+
    "\37\15\1\0\14\15\4\0\14\15\12\0\12\36\36\15\2\0\5\15"+
    "\13\0\54\15\4\0\32\15\6\0\12\36\46\0\34\15\4\0\77\15"+
    "\1\0\35\15\2\0\1\15\12\36\6\0\12\36\15\0\1\15\10\0"+
    "\17\15\101\0\114\15\4\0\12\36\21\0\11\15\14\0\60\15\12\36"+
    "\72\15\14\0\70\15\10\0\12\36\3\0\3\15\12\36\44\15\122\0"+
    "\3\15\1\0\43\15\1\0\2\15\6\0\366\15\6\0\u011a\15\2\0"+
    "\6\15\2\0\46\15\2\0\6\15\2\0\10\15\1\0\1\15\1\0"+
    "\1\15\1\0\1\15\1\0\37\15\2\0\65\15\1\0\7\15\1\0"+
    "\1\15\3\0\3\15\1\0\7\15\3\0\4\15\2\0\6\15\4\0"+
    "\15\15\5\0\3\15\1\0\7\15\53\0\1\13\1\13\25\0\2\15"+
    "\23\0\1\15\34\0\1\15\15\0\1\15\20\0\15\15\63\0\41\15"+
    "\21\0\1\15\4\0\1\15\2\0\12\15\1\0\1\15\3\0\5\15"+
    "\6\0\1\15\1\0\1\15\1\0\1\15\1\0\4\15\1\0\13\15"+
    "\2\0\4\15\5\0\5\15\4\0\1\15\21\0\51\15\u032d\0\64\15"+
    "\u0716\0\57\15\1\0\57\15\1\0\205\15\6\0\11\15\14\0\46\15"+
    "\1\0\1\15\5\0\1\15\2\0\70\15\7\0\1\15\17\0\30\15"+
    "\11\0\7\15\1\0\7\15\1\0\7\15\1\0\7\15\1\0\7\15"+
    "\1\0\7\15\1\0\7\15\1\0\7\15\1\0\40\15\57\0\1\15"+
    "\u01d5\0\3\15\31\0\17\15\1\0\5\15\2\0\5\15\4\0\126\15"+
    "\2\0\2\15\2\0\3\15\1\0\132\15\1\0\4\15\5\0\51\15"+
    "\3\0\136\15\21\0\33\15\65\0\20\15\u0200\0\u19b6\15\112\0\u51cd\15"+
    "\63\0\u048d\15\103\0\56\15\2\0\u010d\15\3\0\20\15\12\36\2\15"+
    "\24\0\63\15\1\0\12\15\1\0\37\15\1\0\123\15\45\0\11\15"+
    "\2\0\147\15\2\0\4\15\1\0\36\15\2\0\2\15\105\0\61\15"+
    "\30\0\64\15\14\0\105\15\13\0\12\36\6\0\30\15\3\0\1\15"+
    "\4\0\12\36\44\15\2\0\44\15\14\0\35\15\3\0\101\15\16\0"+
    "\1\15\12\36\6\0\20\15\12\36\5\15\1\0\67\15\11\0\16\15"+
    "\2\0\12\36\6\0\27\15\3\0\111\15\30\0\3\15\2\0\20\15"+
    "\2\0\5\15\12\0\6\15\2\0\6\15\2\0\6\15\11\0\7\15"+
    "\1\0\7\15\1\0\53\15\1\0\4\15\4\0\2\15\132\0\53\15"+
    "\1\0\2\15\2\0\12\36\6\0\u2ba4\15\14\0\27\15\4\0\61\15"+
    "\u2104\0\u016e\15\2\0\152\15\46\0\7\15\14\0\5\15\5\0\14\15"+
    "\1\0\15\15\1\0\5\15\1\0\1\15\1\0\2\15\1\0\2\15"+
    "\1\0\154\15\41\0\u016b\15\22\0\100\15\2\0\66\15\50\0\14\15"+
    "\4\0\20\15\20\0\16\15\5\0\2\15\30\0\3\15\40\0\5\15"+
    "\1\0\207\15\23\0\12\36\7\0\32\15\4\0\1\15\1\0\32\15"+
    "\13\0\131\15\3\0\6\15\2\0\6\15\2\0\6\15\2\0\3\15"+
    "\43\0\14\15\1\0\32\15\1\0\23\15\1\0\2\15\1\0\17\15"+
    "\2\0\16\15\42\0\173\15\105\0\65\15\210\0\1\15\202\0\35\15"+
    "\3\0\61\15\17\0\1\15\37\0\40\15\20\0\33\15\5\0\53\15"+
    "\5\0\36\15\2\0\44\15\4\0\10\15\1\0\5\15\52\0\236\15"+
    "\2\0\12\36\126\0\50\15\10\0\64\15\234\0\u0137\15\11\0\26\15"+
    "\12\0\10\15\230\0\6\15\2\0\1\15\1\0\54\15\1\0\2\15"+
    "\3\0\1\15\2\0\27\15\12\0\27\15\11\0\37\15\141\0\26\15"+
    "\12\0\32\15\106\0\70\15\6\0\2\15\100\0\4\15\1\0\2\15"+
    "\5\0\10\15\1\0\3\15\1\0\33\15\4\0\3\15\4\0\1\15"+
    "\40\0\35\15\3\0\35\15\43\0\10\15\1\0\36\15\31\0\66\15"+
    "\12\0\26\15\12\0\23\15\15\0\22\15\156\0\111\15\u03b7\0\107\15"+
    "\37\0\12\36\17\0\74\15\25\0\31\15\7\0\12\36\6\0\65\15"+
    "\1\0\12\36\20\0\44\15\2\0\1\15\11\0\105\15\13\0\12\36"+
    "\1\15\45\0\22\15\1\0\45\15\170\0\73\15\5\0\12\36\7\0"+
    "\3\15\1\0\10\15\2\0\2\15\2\0\26\15\1\0\7\15\1\0"+
    "\2\15\1\0\5\15\2\0\11\15\2\0\2\15\2\0\3\15\11\0"+
    "\1\15\5\0\7\15\2\0\7\15\3\0\5\15\u010b\0\106\15\1\0"+
    "\1\15\10\0\12\36\246\0\66\15\2\0\11\15\77\0\101\15\3\0"+
    "\1\15\13\0\12\36\46\0\70\15\10\0\12\36\u01d6\0\100\15\12\36"+
    "\25\0\1\15\u01c0\0\71\15\u0507\0\u0399\15\147\0\157\15\u0b91\0\u042f\15"+
    "\u33d1\0\u0239\15\7\0\37\15\1\0\12\36\146\0\36\15\2\0\5\15"+
    "\13\0\67\15\11\0\4\15\14\0\12\36\11\0\25\15\5\0\23\15"+
    "\u0370\0\105\15\13\0\57\15\20\0\21\15\u4060\0\2\15\u0bfe\0\153\15"+
    "\5\0\15\15\3\0\11\15\7\0\12\15\3\0\2\15\u14c6\0\5\15"+
    "\3\0\6\15\10\0\10\15\2\0\7\15\36\0\4\15\224\0\3\15"+
    "\u01bb\0\125\15\1\0\107\15\1\0\2\15\2\0\1\15\2\0\2\15"+
    "\2\0\4\15\1\0\14\15\1\0\1\15\1\0\7\15\1\0\101\15"+
    "\1\0\4\15\2\0\10\15\1\0\7\15\1\0\34\15\1\0\4\15"+
    "\1\0\5\15\1\0\1\15\3\0\7\15\1\0\u0154\15\2\0\31\15"+
    "\1\0\31\15\1\0\37\15\1\0\31\15\1\0\37\15\1\0\31\15"+
    "\1\0\37\15\1\0\31\15\1\0\37\15\1\0\31\15\1\0\10\15"+
    "\2\0\62\36\u1000\0\305\15\13\0\7\15\u0529\0\4\15\1\0\33\15"+
    "\1\0\2\15\1\0\1\15\2\0\1\15\1\0\12\15\1\0\4\15"+
    "\1\0\1\15\1\0\1\15\6\0\1\15\4\0\1\15\1\0\1\15"+
    "\1\0\1\15\1\0\3\15\1\0\2\15\1\0\1\15\2\0\1\15"+
    "\1\0\1\15\1\0\1\15\1\0\1\15\1\0\1\15\1\0\2\15"+
    "\1\0\1\15\2\0\4\15\1\0\7\15\1\0\4\15\1\0\4\15"+
    "\1\0\1\15\1\0\12\15\1\0\21\15\5\0\3\15\1\0\5\15"+
    "\1\0\21\15\u0274\0\32\15\6\0\32\15\6\0\32\15\u0e76\0\ua6d7\15"+
    "\51\0\u1035\15\13\0\336\15\u3fe2\0\u021e\15\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\uffff\0\u06ed\0"+
    "\360\15\uffff\0\uffff\0\ufe12\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\2\1\3\2\1\3\1\4\1\5\1\6\1\7"+
    "\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17"+
    "\1\2\1\20\1\1\1\0\1\2\1\0\1\21\1\2"+
    "\1\0\1\22\1\2\2\0\1\23\1\24\2\2\1\25"+
    "\1\0\2\2\1\0\2\2\1\0\1\26\1\27\1\0"+
    "\1\30";

  private static int [] zzUnpackAction() {
    int [] result = new int[48];
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
    "\0\0\0\40\0\100\0\140\0\200\0\240\0\300\0\40"+
    "\0\40\0\40\0\40\0\40\0\40\0\40\0\40\0\40"+
    "\0\40\0\40\0\40\0\340\0\u0100\0\u0120\0\u0140\0\u0160"+
    "\0\u0180\0\200\0\u01a0\0\300\0\300\0\u01c0\0\u01e0\0\u0200"+
    "\0\200\0\u0180\0\u0220\0\u0240\0\40\0\u0260\0\u0280\0\u02a0"+
    "\0\u02c0\0\u02e0\0\u0300\0\u0320\0\200\0\200\0\u0340\0\40";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[48];
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
    "\1\2\1\3\1\4\4\5\1\6\1\5\1\7\1\2"+
    "\1\0\1\10\1\5\1\11\1\12\1\13\1\14\1\15"+
    "\1\16\1\17\1\20\1\21\1\22\1\23\4\5\1\24"+
    "\1\25\1\26\42\0\1\27\37\0\1\5\1\30\5\5"+
    "\4\0\1\5\1\31\12\0\3\5\1\32\2\5\3\0"+
    "\7\5\4\0\1\5\1\31\12\0\6\5\3\0\7\5"+
    "\4\0\1\5\1\31\12\0\1\5\1\33\4\5\1\0"+
    "\12\34\2\0\1\35\23\34\2\0\6\5\1\36\4\0"+
    "\1\5\1\31\12\0\6\5\3\0\7\5\4\0\1\5"+
    "\1\31\12\0\5\5\1\25\3\0\7\37\4\0\1\37"+
    "\13\0\6\37\4\0\1\40\36\0\7\5\4\0\1\5"+
    "\1\31\12\0\1\41\5\5\1\0\12\31\2\0\3\31"+
    "\1\42\20\31\2\0\4\5\1\43\2\5\4\0\1\5"+
    "\1\31\12\0\6\5\3\0\7\5\4\0\1\5\1\31"+
    "\12\0\1\44\5\5\3\0\7\37\4\0\1\37\13\0"+
    "\6\37\1\45\4\0\1\46\35\0\7\5\4\0\1\5"+
    "\1\31\12\0\2\5\1\47\3\5\3\0\4\5\1\50"+
    "\2\5\4\0\1\5\1\31\12\0\6\5\6\0\1\51"+
    "\34\0\3\5\1\52\3\5\4\0\1\5\1\31\12\0"+
    "\6\5\3\0\7\5\4\0\1\5\1\31\12\0\4\5"+
    "\1\53\1\5\7\0\1\54\33\0\6\5\1\55\4\0"+
    "\1\5\1\31\12\0\6\5\3\0\1\5\1\56\5\5"+
    "\4\0\1\5\1\31\12\0\6\5\10\0\1\57\40\0"+
    "\1\60\27\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[864];
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
    "\1\0\1\11\5\1\14\11\3\1\1\0\1\1\1\0"+
    "\2\1\1\0\2\1\2\0\4\1\1\11\1\0\2\1"+
    "\1\0\2\1\1\0\2\1\1\0\1\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[48];
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
  
  /** 
   * The number of occupied positions in zzBuffer beyond zzEndRead.
   * When a lead/high surrogate has been read from the input stream
   * into the final zzBuffer position, this will have a value of 1;
   * otherwise, it will have a value of 0.
   */
  private int zzFinalHighSurrogate = 0;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  Lexer(java.io.Reader in) {
    this.zzReader = in;
  }


  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x110000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 2684) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  private static String zzToPrintable(String str) {
    StringBuilder builder = new StringBuilder();
    for (int n = 0 ; n < str.length() ; ) {
      int ch = str.codePointAt(n);
      int charCount = Character.charCount(ch);
      n += charCount;
      if (ch > 31 && ch < 127) {
        builder.append((char)ch);
      } else if (charCount == 1) {
        builder.append(String.format("\\u%04X", ch));
      } else {
        builder.append(String.format("\\U%06X", ch));
      }
    }
    return builder.toString();
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
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
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
    if (zzCurrentPos >= zzBuffer.length - zzFinalHighSurrogate) {
      /* if not: blow it up */
      char newBuffer[] = new char[zzBuffer.length*2];
      System.arraycopy(zzBuffer, 0, newBuffer, 0, zzBuffer.length);
      zzBuffer = newBuffer;
      zzEndRead += zzFinalHighSurrogate;
      zzFinalHighSurrogate = 0;
    }

    /* fill the buffer with new input */
    int requested = zzBuffer.length - zzEndRead;           
    int totalRead = 0;
    while (totalRead < requested) {
      int numRead = zzReader.read(zzBuffer, zzEndRead + totalRead, requested - totalRead);
      if (numRead == -1) {
        break;
      }
      totalRead += numRead;
    }

    if (totalRead > 0) {
      zzEndRead += totalRead;
      if (totalRead == requested) { /* possibly more input available */
        if (Character.isHighSurrogate(zzBuffer[zzEndRead - 1])) {
          --zzEndRead;
          zzFinalHighSurrogate = 1;
        }
      }
      return false;
    }

    // totalRead = 0: End of stream
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
   * Internal scan buffer is resized down to its initial length, if it has grown.
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
    zzFinalHighSurrogate = 0;
    yyline = yychar = yycolumn = 0;
    zzLexicalState = YYINITIAL;
    if (zzBuffer.length > ZZ_BUFFERSIZE)
      zzBuffer = new char[ZZ_BUFFERSIZE];
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
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public Yytoken yylex() throws java.io.IOException {
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

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;
  
      zzState = ZZ_LEXSTATE[zzLexicalState];

      // set up zzAction for empty match case:
      int zzAttributes = zzAttrL[zzState];
      if ( (zzAttributes & 1) == 1 ) {
        zzAction = zzState;
      }


      zzForAction: {
        while (true) {
    
          if (zzCurrentPosL < zzEndReadL) {
            zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
            zzCurrentPosL += Character.charCount(zzInput);
          }
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
              zzInput = Character.codePointAt(zzBufferL, zzCurrentPosL, zzEndReadL);
              zzCurrentPosL += Character.charCount(zzInput);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          zzAttributes = zzAttrL[zzState];
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
        case 1: 
          System.out.println("match: --"+zzToPrintable(yytext())+"--");
          System.out.println("action [62] {  }");
          { 
          }
        case 25: break;
        case 2: 
          System.out.println("match: --"+zzToPrintable(yytext())+"--");
          System.out.println("action [57] { return new Yytoken(24, yytext()); }");
          { return new Yytoken(24, yytext());
          }
        case 26: break;
        case 3: 
          System.out.println("match: --"+zzToPrintable(yytext())+"--");
          System.out.println("action [49] { return new Yytoken(16, yytext()); }");
          { return new Yytoken(16, yytext());
          }
        case 27: break;
        case 4: 
          System.out.println("match: --"+zzToPrintable(yytext())+"--");
          System.out.println("action [50] { return new Yytoken(17, yytext()); }");
          { return new Yytoken(17, yytext());
          }
        case 28: break;
        case 5: 
          System.out.println("match: --"+zzToPrintable(yytext())+"--");
          System.out.println("action [45] { return new Yytoken(12, yytext()); }");
          { return new Yytoken(12, yytext());
          }
        case 29: break;
        case 6: 
          System.out.println("match: --"+zzToPrintable(yytext())+"--");
          System.out.println("action [46] { return new Yytoken(13, yytext()); }");
          { return new Yytoken(13, yytext());
          }
        case 30: break;
        case 7: 
          System.out.println("match: --"+zzToPrintable(yytext())+"--");
          System.out.println("action [39] { return new Yytoken(6, yytext()); }");
          { return new Yytoken(6, yytext());
          }
        case 31: break;
        case 8: 
          System.out.println("match: --"+zzToPrintable(yytext())+"--");
          System.out.println("action [40] { return new Yytoken(7, yytext()); }");
          { return new Yytoken(7, yytext());
          }
        case 32: break;
        case 9: 
          System.out.println("match: --"+zzToPrintable(yytext())+"--");
          System.out.println("action [41] { return new Yytoken(8, yytext()); }");
          { return new Yytoken(8, yytext());
          }
        case 33: break;
        case 10: 
          System.out.println("match: --"+zzToPrintable(yytext())+"--");
          System.out.println("action [42] { return new Yytoken(9, yytext()); }");
          { return new Yytoken(9, yytext());
          }
        case 34: break;
        case 11: 
          System.out.println("match: --"+zzToPrintable(yytext())+"--");
          System.out.println("action [43] { return new Yytoken(10, yytext()); }");
          { return new Yytoken(10, yytext());
          }
        case 35: break;
        case 12: 
          System.out.println("match: --"+zzToPrintable(yytext())+"--");
          System.out.println("action [44] { return new Yytoken(11, yytext()); }");
          { return new Yytoken(11, yytext());
          }
        case 36: break;
        case 13: 
          System.out.println("match: --"+zzToPrintable(yytext())+"--");
          System.out.println("action [47] { return new Yytoken(14, yytext()); }");
          { return new Yytoken(14, yytext());
          }
        case 37: break;
        case 14: 
          System.out.println("match: --"+zzToPrintable(yytext())+"--");
          System.out.println("action [48] { return new Yytoken(15, yytext()); }");
          { return new Yytoken(15, yytext());
          }
        case 38: break;
        case 15: 
          System.out.println("match: --"+zzToPrintable(yytext())+"--");
          System.out.println("action [51] { return new Yytoken(18, yytext()); }");
          { return new Yytoken(18, yytext());
          }
        case 39: break;
        case 16: 
          System.out.println("match: --"+zzToPrintable(yytext())+"--");
          System.out.println("action [56] { return new Yytoken(23, yytext()); }");
          { return new Yytoken(23, yytext());
          }
        case 40: break;
        case 17: 
          System.out.println("match: --"+zzToPrintable(yytext())+"--");
          System.out.println("action [54] { return new Yytoken(21, yytext()); }");
          { return new Yytoken(21, yytext());
          }
        case 41: break;
        case 18: 
          System.out.println("match: --"+zzToPrintable(yytext())+"--");
          System.out.println("action [37] { return new Yytoken(2, yytext()); }");
          { return new Yytoken(2, yytext());
          }
        case 42: break;
        case 19: 
          System.out.println("match: --"+zzToPrintable(yytext())+"--");
          System.out.println("action [52] { return new Yytoken(19, yytext()); }");
          { return new Yytoken(19, yytext());
          }
        case 43: break;
        case 20: 
          System.out.println("match: --"+zzToPrintable(yytext())+"--");
          System.out.println("action [38] { return new Yytoken(3, yytext()); }");
          { return new Yytoken(3, yytext());
          }
        case 44: break;
        case 21: 
          System.out.println("match: --"+zzToPrintable(yytext())+"--");
          System.out.println("action [58] { return new Yytoken(4, yytext()); }");
          { return new Yytoken(4, yytext());
          }
        case 45: break;
        case 22: 
          System.out.println("match: --"+zzToPrintable(yytext())+"--");
          System.out.println("action [53] { return new Yytoken(20, yytext()); }");
          { return new Yytoken(20, yytext());
          }
        case 46: break;
        case 23: 
          System.out.println("match: --"+zzToPrintable(yytext())+"--");
          System.out.println("action [55] { return new Yytoken(22, yytext()); }");
          { return new Yytoken(22, yytext());
          }
        case 47: break;
        case 24: 
          System.out.println("match: --"+zzToPrintable(yytext())+"--");
          System.out.println("action [36] { return new Yytoken(1, yytext()); }");
          { return new Yytoken(1, yytext());
          }
        case 48: break;
        default: 
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            return null;
          } 
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }

  /**
   * Runs the scanner on input files.
   *
   * This main method is the debugging routine for the scanner.
   * It prints debugging information about each returned token to
   * System.out until the end of file is reached, or an error occured.
   *
   * @param argv   the command line, contains the filenames to run
   *               the scanner on.
   */
  public static void main(String argv[]) {
    if (argv.length == 0) {
      System.out.println("Usage : java Lexer [ --encoding <name> ] <inputfile(s)>");
    }
    else {
      int firstFilePos = 0;
      String encodingName = "UTF-8";
      if (argv[0].equals("--encoding")) {
        firstFilePos = 2;
        encodingName = argv[1];
        try {
          java.nio.charset.Charset.forName(encodingName); // Side-effect: is encodingName valid? 
        } catch (Exception e) {
          System.out.println("Invalid encoding '" + encodingName + "'");
          return;
        }
      }
      for (int i = firstFilePos; i < argv.length; i++) {
        Lexer scanner = null;
        try {
          java.io.FileInputStream stream = new java.io.FileInputStream(argv[i]);
          java.io.Reader reader = new java.io.InputStreamReader(stream, encodingName);
          scanner = new Lexer(reader);
          do {
            System.out.println(scanner.yylex());
          } while (!scanner.zzAtEOF);

        }
        catch (java.io.FileNotFoundException e) {
          System.out.println("File not found : \""+argv[i]+"\"");
        }
        catch (java.io.IOException e) {
          System.out.println("IO error scanning file \""+argv[i]+"\"");
          System.out.println(e);
        }
        catch (Exception e) {
          System.out.println("Unexpected exception:");
          e.printStackTrace();
        }
      }
    }
  }


}