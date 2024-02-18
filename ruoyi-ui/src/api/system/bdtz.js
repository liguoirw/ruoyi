import request from '@/utils/request'

// 查询绑机通知列表
export function listBdtz(query) {
  return request({
    url: '/system/bdtz/list',
    method: 'get',
    params: query
  })
}

// 查询绑机通知详细
export function getBdtz(id) {
  return request({
    url: '/system/bdtz/' + id,
    method: 'get'
  })
}

// 新增绑机通知
export function addBdtz(data) {
  return request({
    url: '/system/bdtz',
    method: 'post',
    data: data
  })
}

// 修改绑机通知
export function updateBdtz(data) {
  return request({
    url: '/system/bdtz',
    method: 'put',
    data: data
  })
}

// 删除绑机通知
export function delBdtz(id) {
  return request({
    url: '/system/bdtz/' + id,
    method: 'delete'
  })
}
