.data
num1: .float 0.0
num2: .float 0.0
return_suma: .float 0.0
floa: .float 0.0
.text
suma:
l.s $f1, num1
l.s $f2, num2
add.s $f1, $f1,$f2

s.s $f1, return_suma
jr $ra
end_suma:
main:
li.s $f3, 1.0
s.s $f3, floa
li.s $f4, 3.0
s.s $f4, num1

li.s $f5, 2.0
s.s $f5, num2
jal suma
l.s $f6, return_suma
li.s $f7, 5.0
l.s $f8, floa
add.s $f7, $f7,$f8
add.s $f6, $f6,$f7
li $v0, 2
mov.s $f12, $f6
syscall
end_main:

endProgram:
li $v0, 10 
syscall