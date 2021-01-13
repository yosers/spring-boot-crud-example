function validate() {
    var nama = document.getElementById("nama").value;
    var hp = document.getElementById("hp").value;
    var email = document.getElementById("email");
    var mailformat = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    if(document.myForm.nama.value == "") {
        alert( "Tolong di isi nama!" );
        document.myForm.nama.focus() ;
        return false;
    }
    if(nama.length >= 50) {
        alert( "Tolong isi nama di bawah 50 character!" );
        document.myForm.nama.focus() ;
        return false;
    }
    if(document.myForm.hp.value == "") {
        alert( "Tolong di isi hp!" );
        document.myForm.hp.focus() ;
        return false;
    }
    if(hp.length <= 10) {
        alert( "Minimum No Hp 10 angka!" );
        document.myForm.hp.focus() ;
        return false;
    }
    if(document.myForm.email.value == "") {
        alert( "Tolong di isi email!" );
        document.myForm.email.focus() ;
        return false;
    }
    if(!email.value.match(mailformat))
    {
        alert("Masukan format email yang benar!");
        document.myForm.email.focus() ;
        return false;
    }
    if(document.myForm.alamat.value == "") {
        alert( "Tolong di isi alamat!" );
        document.myForm.alamat.focus() ;
        return false;
    }


    return( true );
}

$(function() {
    var scntDiv = $('#p_scents');
    var i = $('#p_scents p').size() + 1;

    $('#addScnt').live('click', function() {
        $('<p><label for="p_scnts"><input type="text" id="p_scnt" size="20" th:field="*{alamat}"  name="alamat' + i +'" value="" placeholder="Input Value" /></label> <a href="#" id="remScnt">Remove</a></p>').appendTo(scntDiv);
        i++;
        return false;
    });

    $('#remScnt').live('click', function() {
        if( i > 2 ) {
            $(this).parents('p').remove();
            i--;
        }
        return false;
    });
});

