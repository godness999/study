from django.shortcuts import render

# Create your views here.
from django.http import HttpResponse

def index(request):
    print('클라이언트의 요청을 받음')
    input('요청을 처리하는 상태(완료하려면 엔터)')
    return HttpResponse("Hello, world. You're at the polls index.")

# Django에서 가장 간단한 형태의 뷰다.
# 뷰를 호출하려면 이와 연결된 URL이 있어야 하는데, 이를 위해 URLconf가 사용된다.
