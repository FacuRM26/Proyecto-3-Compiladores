.data
hola: .word 0
.text
main:

li $t1, 66
sw $t1, hola
lw $t2, hola
addi $t2, $t2, 1
sw $t2, hola
li $v0, 1
move $a0, $t2
syscall
end_main:

endProgram:
li $v0, 10 
syscall