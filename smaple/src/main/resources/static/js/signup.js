const urlsignUp = "http://localhost:8080/user/signup";

let userId = "";
let password = "";
let userName = "";
let userEmail = "";
let gender = "";
let age = 0;
let birthday = "";

document.querySelector("#userId").addEventListener("change", (e) => {
  console.log(e.target.value);
  // 확인해보면 엄청 길게 나오는데 여기서 value 값이 필요(입력한 값 나와있음)
  //  → e.target.value 사용
  userId = e.target.value;
});

document.querySelector("#password").addEventListener("change", (e) => {
  console.log(e.target.value);
  password = e.target.value;
});

document.querySelector("#userName").addEventListener("change", (e) => {
  console.log(e.target.value);
  userName = e.target.value;
});

document.querySelector("#userEmail").addEventListener("change", (e) => {
  console.log(e.target.value);
  userEmail = e.target.value;
});
document.querySelector("#male").addEventListener("change", (e) => {
  gender = e.target.value;
  console.log(gender);
});
document.querySelector("#female").addEventListener("change", (e) => {
  gender = e.target.value;
  console.log(gender);
});
document.querySelector("#age").addEventListener("change", (e) => {
  console.log(e.target.value);
  age = e.target.value;
});
document.querySelector("#birthday").addEventListener("change", (e) => {
  console.log(e.target.value);
  birthday = e.target.value;
});

document.querySelector(".register").addEventListener("click", () => {
  const data = {
    userId: userId,
    password: password,
    userName: userName,
    userEmail: userEmail,
    gender: gender,
    age: age,
    birthday: birthday,
  };
  axios
    .post(urlsignUp, data, { withCredentials: true }) // url 옆에 전송할 객체 넣음
    .then((response) => {
      console.log("데이터 :", response);
      if (data.userId == response.data.userId) {
        console.log("중복된 아이디입니다.");
      } else if (data.userEmail == response.data.userEmail) {
        console.log("이미 가입한 이력이 있습니다.");
      } else if (data.userName == response.data.userName) {
        console.log("이미 가입한 이력이 있습니다.");
      }
      if (response.status == 201) {
        console.log("회원가입 완료");
        document.querySelector("#userId").value = null;
        document.querySelector("#password").value = null;
        document.querySelector("#userName").value = null;
        document.querySelector("#userEmail").value = null;
        document.querySelector("#age").value = null;
        document.querySelector("#birthday").value = null;
      }
    })
    .catch((error) => {
      console.log("에러발생 : ", error);
    });
});

document.querySelector(".prevBtn").addEventListener("click", () => {
  document.querySelector(".signUp-box").classList.add("hidden");
  document.querySelector(".login-box").classList.remove("hidden");
});

// function sessionCurrent() {
//   axios
//     .get("http://localhost:8080/user/current", { withCredentials: true })
//     .then((response) => {
//       console.log("데이터: ", response);
//       if (response.status == 200) {
//         console.log("세션 유지");
//         document.querySelector(".login-box").classList.add("hidden");
//         document.querySelector(".user-box").classList.remove("hidden");
//         document.querySelector(".user-box p").textContent =
//           response.data + "님 환영합니다.";
//       }
//     })
//     .catch((error) => {
//       console.log("에러 발생: ", error);
//     });
// }

// // js 파일이 로드될 때 호출됨
// sessionCurrent();
