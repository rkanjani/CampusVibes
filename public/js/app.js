
function switchCamera(newLocation){
	var scene = document.querySelector('a-scene');
	

	document.querySelector('a-videosphere').setAttribute("src", "#"+newLocation);
	//scene.reload();

	console.log(scene);


	// if(scene.hasLoaded){
	// 	console.log("1");
	// 	scene.reload();
	// } else {
	// 	console.log("2");

	// 	scene.addEventListener('loaded', reload);
	// }
	console.log($("a-videosphere"));
}

function run(){
	var scene = document.querySelector('a-scene');

	scene.reload();

}
