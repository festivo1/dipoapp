<%@include file="../../admin_shared/header.jsp"%>
<div class="container">

    <div class="row">
        <div class="panel panel-default filterable">
            <div class="panel-heading">
                <h3 class="panel-title">Dipos</h3>
                <div class="pull-right">

                    <a href="${SITE_URL}/dipos/create" type= "button" class="btn btn-xs btn-primary ">
                        <span class="glyphicon glyphicon-plus">
                    </a>
                    <button class="btn btn-default btn-xs btn-filter"><span class="glyphicon glyphicon-filter"></span> Filter</button>
                </div>
            </div>
            <table class="table table-condensed table-hover table-striped table-bordered table-responsive table-list">
                <thead>
                    <tr class="filters">
                        <th><input type="text" class="form-control" placeholder="id" disabled></th>
                        <th><input type="text" class="form-control" placeholder="Name" disabled></th>
                        <th><input type="text" class="form-control" placeholder="Address" disabled></th>
                        <th><input type="text" class="form-control" placeholder="ContactNUmber" disabled></th>
                        <th><input type="text" class="form-control" placeholder="PanNumber" disabled></th>
                        <th><input type="text" class="form-control" placeholder="AddedDate" disabled></th>
                        <th>Action</th>
                        <th>AddRecords</th>
                        <th><b>transactions</b></th>


                    </tr>
                </thead>
                <tbody>
                    <c:forEach var="dipo" items="${dipos}">

                        <tr>
                            <td>${dipo.id}</td>
                            <td>${dipo.name}</td>
                            <td>${dipo.address}</td>
                            <td>${dipo.contactNumber}</td>
                            <td>${dipo.panNumber}</td>
                            <td>${dipo.addedDate}</td>
                            <td align="">
                                <a href="${SITE_URL}/dipos/edit/${dipo.id}" class="btn btn-default"><span class="glyphicon glyphicon-pencil"> </span>    </a>
                                <a href="${SITE_URL}/dipos/delete" class="btn btn-danger"><span class="glyphicon glyphicon-trash"> </span>    </a>
                            </td>
                            <td> 
                                <a href="${SITE_URL}/transactions/create/${dipo.id}" type= "button" class="btn btn-sm btn-primary ">
                                    <span class="glyphicon glyphicon-plus"></span>
                                </a>
                                <a href="${SITE_URL}/transactions/edit/${dipo.id}" class="btn btn-default">
                                    <span class="glyphicon glyphicon-pencil"> </span> 
                                </a>
                             <td> <a href="${SITE_URL}/transactions/report/${dipo.id}" class="btn btn-default">show</a>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
        </div>
    </div>
</div>


                    <%@include file="../../admin_shared/footer.jsp"%>
