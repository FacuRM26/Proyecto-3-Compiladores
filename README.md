# Compiler with JFlex and Cup
## Overview:
The Compiler project is a comprehensive compiler implementation developed using Java, CUP, and JFlex. This project aims to create a compiler from scratch, incorporating new grammatical and syntactic rules. The compiler performs lexical and syntactic analysis, detects errors in the source code, conducts semantic analysis, generates intermediate code, and finally translates the intermediate code into assembly (ASM) code.

## Purpose:
The primary objective of the Compiler project is to provide a robust and customizable compiler solution. By implementing new grammatical and syntactic rules, this project aims to explore the flexibility and extensibility of compiler design. Additionally, the project serves as a learning platform for understanding the intricacies of compiler construction and optimization.

## Features:
- Lexical and Syntactic Analysis: Perform thorough lexical and syntactic analysis of the source code.
- Error Detection: Identify and report any errors present in the source code.
- Semantic Analysis: Conduct semantic analysis to ensure logical correctness and consistency.
- Intermediate Code Generation: Generate intermediate code representing the analyzed source code.
- Assembly Code Translation: Translate the intermediate code into assembly (ASM) code for execution.
## Usage:
To utilize the Zero Compiler, clone this repository and follow the setup instructions provided in the documentation. Once set up, you can run the compiler on a target source code file to perform lexical, syntactic, and semantic analysis. Additionally, you can generate intermediate code and assembly code for further processing and execution.

##Gramar
# GRAMMAR
The BNF Grammar for the imperative language has the following characteristics:
- a. It allows the creation of functions, and within them, control structures, code blocks ({ }), and code statements.
- b. It handles integer, float, boolean, character, and string variable types.
- c. It allows statements for variable creation, creation and assignment of expressions, assignment of expressions to variables, and in some cases, expressions without assignment.
- d. It allows the creation of global and local variables.
- e. In the declaration (variables, functions, and their parameters), return with expression, and switch case, there will be a separator between type and id, which will be #.
- f. Expressions allow combining literals, variables, and/or functions of recognized types in the grammar.
- g. It should allow operators and operands, respecting precedence (usual mathematics), and allowing the use of parentheses.
- h. It allows binary arithmetic expressions of addition (+), subtraction (-), division (/) –integer or decimal according to type--, multiplication (*), modulo (%), and power (^). For integers or reals.
- i. It allows unary arithmetic expressions of negative (-); ++ and --, after the operand; this for integers, additionally, the negative can also be applied to floats. The negative to literals and the ++ and -- to variables.
- j. It allows relational expressions (over integers and floats) of less than, less than or equal, greater than, greater than or equal, equal, and not equal. The equal and not equal operators additionally allow boolean type.
- k. It allows logical expressions of conjunction (&), disjunction (|), and negation (this can be a function or character (! or not)).
- l. It must allow code statements for the different expressions mentioned above and their combination, the end-of-expression delimiter will be the semicolon (;). Additionally, these expressions can be used in the conditionals and blocks of the following control structures.
- m. It must allow the use of types and the combination of arithmetic (binary and unary), relational, and logical expressions, according to the grammatical, arithmetic, relational, and logical rules of the Imperative Paradigm, for example, taking as reference the C language.
- n. The grammar generates a language with explicit and strong typing.
- o. It must allow control structures if-[else], switch, while-else (Python type or if type), and forRange (optional start -default 0-, required end, optional "step" -default 1-), also allowing return and break. The expressions of the conditions (if, while) must be boolean values ​​combining arithmetic, logical, and relational expressions.
- p. It must allow read (integers and floats) and write functions to standard output (character string, integers, and floats), literals or variables can be written.
- q. It must allow the creation and use of functions; these must return values ​​(integer, floats, and booleans) and receive parameters (types except string).
- r. It must define a single initial procedure main, through which the execution of programs starts; with zero or many functions.
- s. Additionally, it must allow single-line (//) or multi-line (/* */) comments.
