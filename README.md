# 01 시작
## 1) eclipse에서 spring 프로젝트 생성
## 2) git repository 생성
## 3) eclipse 프로젝트와 git 연결
    - 해당 workspace 폴더 안에서
    $ git init
    $ git remote add origin (repository 주소)
    - gitignore 파일 설정
    - commit and push

# 02 npm 설치
    # sudo apt-get update
    # sudo apt-get install npm
    # npm init
    (
      Error: CERT_UNTRUSTED의 경우
      # npm config set strict-ssl false
    )
    
# 03 thymeleaf 셋팅
## 1) pom.xml
## 2) servlet-context.xml
	- 기존 InternalResourceViewResolver 주석 처리
	- 추가 사항(thymeleaf View 설정 , thymeleaf laytout을 쓰기위해 3rd Party 추가, thymeleaf laytout ViewResolver 설정)
## 3) 기타 파일
    - /WEB-INF/views/layout 폴더 이하
    
# 04 DB 연결
## 1) pom.xml
## 2) maria DB 설치
## 3) root-context.xml
