<%@include file="../../admin_shared/header.jsp" %>

<div class="container">
    <div class="col-md-6">
        <div class="form-area">  
            <form role="form" method="post" name ="dipoDTO"  action="${SITE_URL}/dipos/save">
                <br style="clear:both">
                <h3 style="margin-bottom: 25px;"> Register Dipo</h3>
                <div class="form-group col-md-6">
                        <label>Username</label>
                        <input type="text" class="form-control" id="username" name="username" placeholder=" username" required>
                    </div>
                <div class="form-group col-md-6">
                        <label>password</label>
                        <input type="text" class="form-control" id="password" name="password" placeholder=" password" required>
                    </div>
                <div class="form-group">
                    
                    <label>DipoName</label>
                    <input type="text" class="form-control" id="name" name="name" placeholder="Name" required>
                </div>
                

                <div class="form-group">
                    <label>address</label>
                    <input type="text" class="form-control" id="address" name="address" placeholder="address" required="required"/>
                </div>
                
                <div class="row">
                    <div class="form-group col-md-6">
                        <label>ContactNumber</label>
                        <input type="text" class="form-control" id="contact" name="contactNumber" placeholder="contactNumber" required>
                    </div>
                    <div class="form-group col-md-6">
                        <label>PanNumber</label>
                        <input type="text" class="form-control" id="pan" name="panNumber" placeholder=" pannumber" required>
                    </div>
                </div>

                
                <div>
                <input  name="id" value="0"/>
                </div>
                <button type="submit" name="submit" value="save " class="btn btn-success">save</button>
               
                <button type="button" id="submit" name="submit" class="btn btn-primary ">save & continue </button>
                <a href="${SITE_URL}/dipos" type="button" class="btn btn-danger" name="back" class="btn btn-default ">Back</a>
                
            </form>
        </div>
    </div>
                <%@include file="../../admin_shared/footer.jsp" %>