from os import system
import sys
from django.http import HttpResponse
from django.shortcuts import render
from django.http import HttpResponse

# Create your views here.
def home(request):
    return render(request, 'home.html')

def run_rand(request):
    if request.method == "POST":
        j_code = request.POST['j_code']
        e_behavior = request.POST['e_behavior']
        j_file = open("TestClass1.java", "w+")
        j_file.write(j_code)
        j_file.close()
        if e_behavior != None:
            e_file = open("ex_behavior.json", "w+")
            e_file.write(e_behavior)
            e_file.close()
        rand_dir = 'G:\\Downloads\\randoop-4.3.0\\randoop\\randoop-all-4.3.0.jar'
        j_dir = 'G:\\Study\\5th Sem\SPL\\run_randoop\\'
        compile_command = 'javac \"'+j_dir+'\TestClass1.java\"'
        p = system(compile_command)
        rand_command = 'java -cp \"'+j_dir+';'+rand_dir+'\" randoop.main.Main gentests --testclass=\"TestClass1\"'
        p = system(rand_command)
    return HttpResponse(p)
