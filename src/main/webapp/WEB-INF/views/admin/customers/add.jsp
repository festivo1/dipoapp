<%@include file="../../customer_shared/header.jsp"%>
<div class="page-header">
    <h1>Add Customers</h1>

</div>
<form name="customer" method="post" action="${SITE_URL}/admin/customers/save">
    <div class="form-group">
        <label> First Name</label>
        <input class="form-control" type="text" name="firstName" required="required"/>
    </div> 
    <div  class="form-group">
        <label>Last Name</label>
        <input class="form-control" type="text" name="lastName" required="required"/>
    </div>

    <div class="form-group">
        <label>Email</label>
        <input class="form-control" type="text" name="email" />
    </div> 

    <div class="form-group">
        <label>Contact_No</label>
        <input class="form-control"  type="text" name="contactNum" required="required"/>
    </div>    

    <div class="form-inline">
        <label>Status</label>
        <label><input type="checkbox" name="status"/> Active</label>
    </div>

    <div>
        <input type="hidden"  name="id" value="0"/>
        <button type="submit" name="submit" value="save " class="btn btn-success">Save</button>
        <a href="${SITE_URL}/admin/customers " class="btn btn-danger">Back</a>
    </div>
</form>

<%@include file="../../customer_shared/footer.jsp"%>