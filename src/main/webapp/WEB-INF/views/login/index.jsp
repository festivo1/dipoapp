<%@include file="../customer_shared/header.jsp" %>
<div class="container">
    <div class="col-md-6">
        <div class="form-area">  
            <c:if test="${not empty error}">
                <div class="error">${error}</div>
            </c:if>
            <c:if test="${not empty msg}">
                <div class="msg"><h3>${msg}</h3></div>
            </c:if>

            <form role="form"  name ="loginForm"   
                  action="<c:url value='/j_spring_security_check' />" method='POST'>
                <br style="clear:both">
                <h3 style="margin-bottom: 25px;"> Login </h3>
                <div class="form-group">
                    <label>Username</label>
                    <input type="text" class="form-control" id="username" name="username" placeholder="username"/>
                </div>
                <div class="form-group">
                    <label>password</label>
                    <input type="password" class="form-control" id="password" name="password" placeholder=" password"/>
                </div>

                <div class="form-group">
                    <input id="_spring_security_remember_me" name="_spring_security_
                           remember_me" type="checkbox" value="true"/>
                    <label for="_spring_security_remember_me">Remember Me?</label>
                </div>
                <div class="row">
                    <div class="form-group col-md-6">
                        <input name="submit" type="submit"
                               value="submit" />
                    </div>
                    
                </div>
<!--                <<form action="/dipos">
                    <div class="form-group col-md-6">
                        <input name="register for new" type="submit" value="register"/>
                    </div>
                </form>-->
                <div class="form-group">
                    <input type="hidden" name="${_csrf.parameterName}"
                           value="${_csrf.token}" />
                </div>

            </form>
        </div>
    </div>
</div>

<%@include file="../customer_shared/footer.jsp"%>
