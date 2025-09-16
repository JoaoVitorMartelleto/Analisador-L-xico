package util;

public enum TokenType {

    IDENTIFIER,
    INT_LITERAL,
    FLOAT_LITERAL,

    PLUS, MINUS, STAR, SLASH,

    ASSIGN,

    GT, GTE, LT, LTE, NEQ, EQ,

    LPAREN, RPAREN,

    KW_INT, KW_FLOAT, KW_PRINT, KW_IF, KW_ELSE,

    EOF
}