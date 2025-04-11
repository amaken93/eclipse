/**
 * リアルタイム更新
 */
function two(num) {
	let two;
	if (num < 10) {
		two = "0" + num;
	} else {
		two = num;
	}
	return two;
}

function countdown() {
	const ndate = document.getElementById("ndate");
	const ftime = document.getElementById("ftime");
	const now = new Date();
	const future = new Date(ndate.value + " " + ftime.value);
	const rest = future.getTime() - now.getTime();

	const sec = Math.floor(rest / 1000) % 60;
	const min = Math.floor(rest / 1000 / 60) % 60;
	const hour = Math.floor(rest / 1000 / 60 / 60) % 24;
	let count;
	if (sec < 0 && min < 0 && hour < 0) {
		count = "時間が経過しました。"
	} else {
		count = hour + "時間" + two(min) + "分" + two(sec) + "秒";
	}
	return count;
}



function realtime() {
	const now = new Date();

	const sec = now.getSeconds();
	const min = now.getMinutes();
	const hour = now.getHours();
	const realtime = two(hour) + ":" + two(min) + ":" + two(sec);
	return realtime;
}

function recalc() {
	document.getElementById("realtime").textContent = realtime();
	document.getElementById("timer").textContent = countdown();
	refresh();
}

function refresh() {
	setTimeout(recalc, 1000);
}

recalc();
