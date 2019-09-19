function post() {
   var questionId = $("#question_id").val();
   var content = $("#comment_content").val();
    $.ajax({
        type: "POST",
        contentType: 'application/json',
        url: "/comment",
        data: JSON.stringify({
           "parentId":questionId,
            "content":content,
            "type":1
        }),
        success: function (response) {
           if (response.code == 200){
              $("#comment_section").hide();
           }else {
               if (response.code == 2003){
                   var isAccepted = confirm(response.message);
                   if (isAccepted){
                       window.open("https://github.com/login/oauth/authorize?client_id=49d0a583ad7ef700f872&redirect_uri=http://localhost:8887/callback&scope=user&state=1")
                       window.localStorage.setItem("closable",true);
                   }
               }else {
                   alert(response.message);
               }
           }
        },
        dataType: "json"
    });
}