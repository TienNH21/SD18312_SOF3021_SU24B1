<%@page language="java" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="f" uri="jakarta.tags.functions" %>

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css" rel="stylesheet" crossorigin="anonymous">
</head>
<body>
<div class="col-10 offset-1">

<form class="mt-3 col-8 offset-2" action="/san-pham/index">
    <div class="row">
        <div class="col-8">
            <label class="col-2">Tên</label>
            <div class="col-10">
                <input name="keyword" class="form-control" />
            </div>
        </div>
        <div class="mt-2 col-3">
            <button class="btn btn-light">Tìm kiếm</button>
        </div>
    </div>
</form>

<div class="col-10 offset-1">
    <table class="table table-stripped">
        <thead>
        <tr>
            <th>ID</th>
            <th>Sản phẩm</th>
            <th>Màu sắc</th>
            <th>Kích thước</th>
            <th>Mã SPCT</th>
            <th>Số lượng</th>
            <th>Đơn giá</th>
            <th>Trạng thái</th>
            <th colspan="2">Thao tác</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${ data }" var="spct">
            <tr>
                <td>${ spct.id }</td>
                <td>${ spct.tenSP }</td>
                <td>${ spct.idMS }</td>
                <td>${ spct.idKT }</td>
                <td>${ spct.maSPCT }</td>
                <td>${ spct.soLuong }</td>
                <td>${ spct.donGia }</td>
                <td>${ sp.trangThai == 1 ? "Dang hoat dong" : "Ngung hoat dong" }</td>
                <td>
                    <a href="#">Update</a>
                </td>
                <td>
                    <a href="#">Delete</a>
                </td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</div>

</div>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
</body>
</html>
