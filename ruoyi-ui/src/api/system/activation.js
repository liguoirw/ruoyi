import request from '@/utils/request'

// 查询伪激活机械列表
export function listActivation(query) {
  return request({
    url: '/system/activation/list',
    method: 'get',
    params: query
  })
}

// 查询伪激活机械详细
export function getActivation(id) {
  return request({
    url: '/system/activation/' + id,
    method: 'get'
  })
}

// 新增伪激活机械
export function addActivation(data) {
  return request({
    url: '/system/activation',
    method: 'post',
    data: data
  })
}

// 修改伪激活机械
export function updateActivation(data) {
  return request({
    url: '/system/activation',
    method: 'put',
    data: data
  })
}

// 删除伪激活机械
export function delActivation(id) {
  return request({
    url: '/system/activation/' + id,
    method: 'delete'
  })
}
