.data
main_mula: .word 0
main_cute: .byte 0
main_hijo: .float 0.0
main_mulo: .word 0
main_perra: .word 0
hola: .byte 0
.text
main:

li $t1, 'x'
sb $t1, hola
lb $t2, hola
li $v0, 11
move $a0, $t2
syscall
end_main:

endProgram:
li $v0, 10 
syscall