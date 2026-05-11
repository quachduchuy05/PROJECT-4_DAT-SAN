const searchInput =
    document.getElementById("searchInput");

searchInput.addEventListener("keyup", function () {

    let keyword =
        searchInput.value.toLowerCase();

    let rows =
        document.querySelectorAll("tbody tr");

    rows.forEach(row => {

        let text =
            row.innerText.toLowerCase();

        if(text.includes(keyword)){
            row.style.display = "";
        }else{
            row.style.display = "none";
        }

    });

});