$(function () {
    $('tr #deleteUsuario').click(function (e){
       e.preventDefault();
       var cod = $(this).parent().find('#codigo').val();
       Swal.fire({
            title: "Esta Seguro de Eliminar?",
            text: "Una vez eliminado deberá agregar de nuevo!",
            icon: "warning",
            showCancelButton: true,
            confirmButtonClass: "btn-danger",
            confirmButtonText: "Sí, Eliminar!",
            cancelButtonText: "No, Cancelar!",
            closeOnConfirm: false,
            closeOnCancel: false
        }).then((result)=> {
            if (result.isConfirmed) {
                $.ajax({
                    type: 'POST',
                    url: "conusuario.do?txtAccion=delete2&id=" + cod,
                    async: true,
                    data: {id:cod},
                    success: function (data) {
                        Swal.fire("Eliminado!", "El usuario se ha eliminado", "success");
                        setTimeout(function (){
                            parent.location.href = "conusuario.do?txtAccion=listUsuario"
                        }, 1800);
                        alertify.success(' Usuario Eliminado');
                    }
                });
            } else if (result.dismiss === Swal.DismissReason.cancel){
                        Swal.fire("Cancelado", "Cancelaste la eliminación", "error");
                }
            
        });
    });
});

// Producto
$(function () {
    $('tr #deleteProducto').click(function (e){
       e.preventDefault();
       var cod = $(this).parent().find('#codigo').val();
       Swal.fire({
            title: "Esta Seguro de Eliminar?",
            text: "Una vez eliminado deberá agregar de nuevo!",
            icon: "warning",
            showCancelButton: true,
            confirmButtonClass: "btn-danger",
            confirmButtonText: "Sí, Eliminar!",
            cancelButtonText: "No, Cancelar!",
            closeOnConfirm: false,
            closeOnCancel: false
        }).then((result)=> {
            if (result.isConfirmed) {
                $.ajax({
                    type: 'POST',
                    url: "comproducto.do?txtAccion=delete2&id=" + cod,
                    async: true,
                    data: {id:cod},
                    success: function (data) {
                        Swal.fire("Eliminado!", "El Producto se ha eliminado", "success");
                        setTimeout(function (){
                            parent.location.href = "conusuario.do?txtAccion=listUsuario"
                        }, 1800);
                        alertify.success(' Producto Eliminado');
                    }
                });
            } else if (result.dismiss === Swal.DismissReason.cancel){
                        Swal.fire("Cancelado", "Cancelaste la eliminación", "error");
                }
            
        });
    });
});
