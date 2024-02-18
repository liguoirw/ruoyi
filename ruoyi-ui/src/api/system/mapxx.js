import request from '@/utils/request'

// 查询地图信息列表
export function listMapxx(query) {
  return request({
    url: '/system/mapxx/list',
    method: 'get',
    params: query
  })
}

// 查询地图信息详细
export function getMapxx(id) {
  return request({
    url: '/system/mapxx/' + id,
    method: 'get'
  })
}

// 新增地图信息
export function addMapxx(data) {
  return request({
    url: '/system/mapxx',
    method: 'post',
    data: data
  })
}

// 修改地图信息
export function updateMapxx(data) {
  return request({
    url: '/system/mapxx',
    method: 'put',
    data: data
  })
}

// 删除地图信息
export function delMapxx(id) {
  return request({
    url: '/system/mapxx/' + id,
    method: 'delete'
  })
}
