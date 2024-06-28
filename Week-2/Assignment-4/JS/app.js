// Click to Change Text
let welcomeMesBlock = document.querySelector(".welcome-mes");
let welcomeMes = welcomeMesBlock.querySelector("h2");

welcomeMesBlock.addEventListener("click", () =>{
    welcomeMes.textContent = "Have a Good Time!";
})

// Click to Show More Content Boxes
let ctaButton = document.querySelector(".cta");
let hiddenBlock = document.querySelector(".hidden");

ctaButton.addEventListener("click", () =>{
    hiddenBlock.style.display = "flex";
})