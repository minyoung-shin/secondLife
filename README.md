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
	<dependency>
		<groupId>org.thymeleaf</groupId>
		<artifactId>thymeleaf</artifactId>
		<version>2.1.4.RELEASE</version>
	</dependency>
	
	<dependency>
		<groupId>org.thymeleaf</groupId>
		<artifactId>thymeleaf-spring4</artifactId>
		<version>2.1.4.RELEASE</version>
	</dependency>
	
	<dependency>
		<groupId>nz.net.ultraq.thymeleaf</groupId>
		<artifactId>thymeleaf-layout-dialect</artifactId>
		<version>1.3.1</version>
	</dependency>
## 2) servlet-context.xml
	- 기존 InternalResourceViewResolver 주석 처리
	- 추가 사항
	<!-- thymeleaf View 설정 -->
	<beans:bean id="templateResolver" class="org.thymeleaf.spring4.templateresolver.SpringResourceTemplateResolver">
		<beans:property name="prefix" value="/WEB-INF/views/" />
		<beans:property name="suffix" value=".html" />
		<beans:property name="templateMode" value="HTML5" />
		<beans:property name="characterEncoding" value="UTF-8" />
		<beans:property name="cacheable" value="false" />
	</beans:bean>
	
	<!-- thymeleaf laytout을 쓰기위해 3rd Party 추가 -->
	<beans:bean id="templateEngine" class="org.thymeleaf.spring4.SpringTemplateEngine">
		<beans:property name="templateResolver" ref="templateResolver" />
		<beans:property name="additionalDialects">
			<beans:set>
				<beans:bean class="nz.net.ultraq.thymeleaf.LayoutDialect" />
			</beans:set>
		</beans:property>
	</beans:bean>
	
	<!-- thymeleaf laytout ViewResolver 설정 -->
	<beans:bean class="org.thymeleaf.spring4.view.ThymeleafViewResolver">
		<beans:property name="templateEngine" ref="templateEngine" />
		<beans:property name="characterEncoding" value="UTF-8" />
		<beans:property name="order" value="1" />
	</beans:bean>
## 3) 기타 파일
    - /WEB-INF/views/layout 폴더 이하