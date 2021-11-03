const notice_update_button = document.querySelector('.notice_update_button');
const notice_delete_button = document.querySelector('.notice_delete_button');
notice_update_button.onclick = () => {
	const notice_code = document.querySelector('#notice_code');  // 원래 dtl에서는 notice_code가 없어서 hidden input을 만듦
	location.href = 'notice-update?code=' + notice_code.value;   	
}

notice_delete_button.onclick = () => {
	const notice_code = document.querySelector('#notice_code');  // 원래 dtl에서는 notice_code가 없어서 hidden input을 만듦
	location.href = 'notice-delete?code=' + notice_code.value;   	
}