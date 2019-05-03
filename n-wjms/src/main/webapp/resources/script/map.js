setTimeout(function() {
            var mapContainer = document.getElementById('map'), // 지도를 표시할 div  
            mapOption = {
                center: new daum.maps.LatLng(37.3238926, 127.9788252), // 지도의 중심좌표
                level: 3 // 지도의 확대 레벨
            };

        var map = new daum.maps.Map(mapContainer, mapOption); // 지도를 생성합니다    
        // 주소-좌표 변환 객체를 생성합니다
        var geocoder = new daum.maps.services.Geocoder();

        var selectOverlay = null;

        var res_addr = new Array('강원 원주시 혁신로 39-2 1층 103호', '강원 원주시 혁신로 53', '강원 원주시 혁신로 35 1층 107호');
        var res_content = new Array('<div class="wrap">' +
            '    <div class="info">' +
            '        <div class="title">' +
            '            우리동네국수집' +
            '            <div class="close" onclick="closeOverlay()" title="닫기"></div>' +
            '        </div>' +
            '        <div class="body">' +
            '            <div class="img">' +
            '                <img src="http://cfile181.uf.daum.net/image/250649365602043421936D" width="73" height="70">' +
            '           </div>' +
            '            <div class="desc">' +
            '                <div class="ellipsis">강원 원주시 혁신로 39-2 1층 103호</div>' +
            '                <div class="jibun ellipsis">강원 원주시 혁신로 39-2 1층 103호</div>' +
            '                <div><a href="#emp_resinfo" data-transition="slide" class="link">홈페이지</a></div>' +
            '            </div>' +
            '        </div>' +
            '    </div>' +
            '</div>',

            '<div class="wrap">' +
            '    <div class="info">' +
            '        <div class="title">' +
            '            용우동' +
            '            <div class="close" onclick="closeOverlay()" title="닫기"></div>' +
            '        </div>' +
            '        <div class="body">' +
            '            <div class="img">' +
            '                <img src="http://cfile181.uf.daum.net/image/250649365602043421936D" width="73" height="70">' +
            '           </div>' +
            '            <div class="desc">' +
            '                <div class="ellipsis">강원 원주시 혁신로 53</div>' +
            '                <div class="jibun ellipsis">강원 원주시 혁신로 53</div>' +
            '                <div><a href="#emp_resinfo" data-transition="slide" class="link">홈페이지</a></div>' +
            '            </div>' +
            '        </div>' +
            '    </div>' +
            '</div>',

            '<div class="wrap">' +
            '    <div class="info">' +
            '        <div class="title">' +
            '            혁신밥집' +
            '            <div class="close" onclick="closeOverlay()" title="닫기"></div>' +
            '        </div>' +
            '        <div class="body">' +
            '            <div class="img">' +
            '                <img src="http://cfile181.uf.daum.net/image/250649365602043421936D" width="73" height="70">' +
            '           </div>' +
            '            <div class="desc">' +
            '                <div class="ellipsis">강원 원주시 혁신로 35 1층 107호</div>' +
            '                <div class="jibun ellipsis">강원 원주시 혁신로 35 1층 107호</div>' +
            '                <div><a href="#emp_resinfo" data-transition="slide" class="link">홈페이지</a></div>' +
            '            </div>' +
            '        </div>' +
            '    </div>' +
            '</div>');

        for (var i = 0; i < res_addr.length; ++i) {
            (function(i) {
                // 주소로 좌표를 검색합니다
                geocoder.addressSearch(res_addr[i], function(result, status) {
                    // 정상적으로 검색이 완료됐으면 
                    if (status === daum.maps.services.Status.OK) {

                        var coords = new daum.maps.LatLng(result[0].y, result[0].x);

                        // 마커를 생성합니다
                        var marker = new daum.maps.Marker({
                            map: map, // 마커를 표시할 지도
                            position: coords // 마커의 위치
                        });

                        marker.setMap(map);

                        // 마커에 클릭이벤트를 등록합니다
                        daum.maps.event.addListener(marker, 'click', function() {
                            var coords2 = new daum.maps.LatLng(String(Number(result[0].y) + 0.0005), result[0].x);
                            map.panTo(coords2),
                            customOverlay.setPosition(coords),
                            customOverlay.setContent(res_content[i]),
                            customOverlay.setMap(map)
                        });
                    }
                });
            })(i);
        }
}, 1000);

var customOverlay = new daum.maps.CustomOverlay({
    position: null,
    content: null
});

// 커스텀 오버레이를 닫기 위해 호출되는 함수입니다 
function closeOverlay() {
    customOverlay.setMap(null);
}